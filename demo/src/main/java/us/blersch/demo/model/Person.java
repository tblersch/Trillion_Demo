package us.blersch.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="User")

public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String street;
    private String city;
    private String state;
    private String zip;
    private String name;
    private String password;

    public Person(){}

    public Person(String street, String city, String state, String zip, String name, String password)
    {
        this(street, city,state,zip,name);
        this.id = id;
        this.password = password;
    }

    public Person(String street, String city, String state, String zip, String name)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getName(){return name;}

    public void setName(String name) {this.name = name;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    @Override
    public boolean equals (Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person addr = (Person) obj;
        return Objects.equals(this.id, addr.id) && Objects.equals(this.city, addr.city) && Objects.equals(this.state, addr.state) && Objects.equals(this.street, addr.street) && Objects.equals(this.zip, addr.zip);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.city, this.state, this.zip, this.street, this.id);
    }


}
