package us.blersch.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>
{
    List<Person> findAddressByZipAndAndIdIsNot(String zip, Long id);
    List<Person> findAddressByZip(String zip);
    Person findByName(String name);
}
