/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author riddhivora
 */
public class PersonDirectory {
     private ArrayList<Person> people;  
    
    public PersonDirectory(){
        // creating a new arraylist with person directory (memory allocated)
        this.people = new ArrayList<Person>();   
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
    
    public Person addNewPerson(){
        
        Person newPerson = new Person();
        people.add(newPerson);
        return newPerson;
    }
}
