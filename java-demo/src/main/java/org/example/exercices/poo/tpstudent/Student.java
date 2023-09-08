package org.example.exercices.poo.tpstudent;

public class Student extends Person{
    public Student() {
    }

    public Student(int age) {
        super(age);
    }

    public void GoToClasses()
    {
        System.out.println("I’m going to class.");
    }

    public void displayAge()
    {
        System.out.println("My age is " + age + " years old");
    }

}
