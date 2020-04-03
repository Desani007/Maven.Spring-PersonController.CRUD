package io.zipcoder.crudapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="PERSON")
public class Person {
   @Id
   @JsonIgnore
   @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
   String firstName;
   String lastName;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fristname) {
        this.firstName = fristname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
