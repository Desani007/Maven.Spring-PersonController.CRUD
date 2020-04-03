package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.Service.PersonService;
import io.zipcoder.crudapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PersonController {
    @Autowired
PersonService personService;

    public PersonController(PersonService personService) {
        this.personService=personService;
    }

    @PostMapping(value = "/person/")
    public ResponseEntity<Person> createPerson(@RequestBody  Person p){
   return new ResponseEntity<>(personService.create(p), HttpStatus.CREATED);
    }

    @GetMapping(value = "/person/{id}")
    public ResponseEntity<Person> findby(@RequestParam Long id){
        return new ResponseEntity<>(personService.findbyid(id),HttpStatus.OK);
    }

    @GetMapping(value = "/allperson/")
    public ResponseEntity<List<Person>> findAll(){
        return new ResponseEntity<>(personService.findAll(),HttpStatus.OK);
    }
    @PutMapping(value ="/person/update/{id}")
    public ResponseEntity<Person> update (@RequestBody Person p,@RequestParam Long id){
        return new ResponseEntity<>(personService.update(p,id),HttpStatus.OK);
    }
    @DeleteMapping(value="person/delete")

    public ResponseEntity<Person> delete(long id){
        personService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
