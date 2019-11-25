package us.blersch.demo.controller;

import us.blersch.demo.model.Person;
import us.blersch.demo.model.PersonFormObject;
import us.blersch.demo.model.PersonRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository ar;

    @RequestMapping(value="/")
    public String home()
    {
        return "home";
    }

    @RequestMapping(value="/users")
    public String viewUsers(@ModelAttribute("formObject") PersonFormObject formObject, Model model)
    {
        List<Person> results;
        if (formObject.getZip() == null || formObject.getZip().isEmpty())
        {
             results = ar.findAll();
        }
        else
        {
            results = ar.findAddressByZip(formObject.getZip());
        }
        model.addAttribute("users", results);
        model.addAttribute("zip", formObject.getZip());
        return "index";
    }

    @RequestMapping("/users/{id}")
    public String getUserWithID(@PathVariable("id") Long id)
    {
        Optional<Person> a = ar.findById(id);
        try {
            if (a.isPresent()) {
                ObjectMapper mapper = new ObjectMapper();
                return mapper.writeValueAsString(a.get());
            } else {
                return "No such record";
            }
        }
        catch (Exception ex)
        {
            return "No such record";
        }
    }

    @RequestMapping(value="/register")
    public String RegisterUser(Model model)
    {
        model.addAttribute("person", new Person());
        return "register";
    }

    @PostMapping(value="/addUser")
    public String addUser(@ModelAttribute Person person)
    {
        ar.save(person);
        return "redirect:/users";
    }
}
