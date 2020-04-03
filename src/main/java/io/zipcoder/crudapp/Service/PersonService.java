package io.zipcoder.crudapp.Service;

import io.zipcoder.crudapp.model.Person;
import io.zipcoder.crudapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    PersonRepository personRepository;

    public Person  create(Person p){
       return personRepository.save(p);
    }

    public Person findbyid(long id){
        return personRepository.findOne(id);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person update(Person p,Long id){
        Person updated =personRepository.findOne(id);
        updated.setFirstName(p.getFirstName());
        updated.setLastName(p.getLastName());
        return personRepository.save(updated);
    }

    public void delete(long id){
          personRepository.delete(id);
    }
}
