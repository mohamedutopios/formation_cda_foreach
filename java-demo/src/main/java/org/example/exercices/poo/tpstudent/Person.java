package org.example.exercices.poo.tpstudent;

public class Person {
    protected int age;

    public Person()
    {

    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello()
    {
        System.out.println("Hello");
    }

}
