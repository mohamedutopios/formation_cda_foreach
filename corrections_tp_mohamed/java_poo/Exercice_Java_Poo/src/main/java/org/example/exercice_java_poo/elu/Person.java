package org.example.exercice_java_poo.elu;

public class Person {
    public String lastName, firstName;
    protected float accountAmount;

    public Person(String firstName, String lastName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.accountAmount = 0;
    }

    public float getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(float accountAmount) {
        this.accountAmount = accountAmount;
    }

    void addMoney(float amount)
    {
        this.accountAmount += amount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", accountAmount=" + accountAmount +
                '}';
    }
}
