package org.example.exercices.poo.tpstudent;

public class Teacher extends Person{
    private String subject;

    public Teacher()
    {

    }

    public Teacher(int age)
    {
        super(age);
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(int age, String subject) {
        super(age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void explain()
    {
        System.out.println("Explanation begins");
    }

}
