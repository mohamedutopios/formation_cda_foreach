package org.example;


import org.example.models.Maison;
import org.example.models.Person;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstname("toto");
        person.setLastname("tutu");
        person.setId(5);
        System.out.println(person);
     Person person1 = new Person(3,"toto","tata");
        System.out.println(person1);

        System.out.println(person.equals(person1));

        Maison maison= new Maison(5,"tourcoing",45,"rue des pias");
        System.out.println(maison);


    }

}