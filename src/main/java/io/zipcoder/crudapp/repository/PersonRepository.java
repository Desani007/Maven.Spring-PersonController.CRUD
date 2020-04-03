package io.zipcoder.crudapp.repository;

import io.zipcoder.crudapp.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
    List <Person> findAll();




}
