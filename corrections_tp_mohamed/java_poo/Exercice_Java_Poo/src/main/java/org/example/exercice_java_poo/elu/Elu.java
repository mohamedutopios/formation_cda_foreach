package org.example.exercice_java_poo.elu;

import java.util.ArrayList;
import java.util.List;

public abstract class Elu extends Person{

    public List<Person> assistants = new ArrayList<Person>();

    public Elu(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public List<Person> getAssistants() {
        return assistants;
    }

    public void setAssistants(List<Person> assistants) {
        this.assistants = assistants;
    }

    public void engageAssistant(Person assistant)
    {
        this.assistants.add(assistant);
    }

    public void dismissAssistant(String firstName, String lastName)
    {
        //for each, assistants.remove if condition
        assistants.removeIf(p -> p.firstName.equals(firstName) && p.lastName.equals(lastName));
    }

    public void sendDotation(float amount)
    {
        for (Person p: assistants) {
            float amountForEach = amount/assistants.toArray().length;
            p.addMoney(amountForEach);
        }
    }

    @Override
    public String toString() {
        return "Elu{" +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName +
                "assistants=" + assistants +
                " }";
    }
}
