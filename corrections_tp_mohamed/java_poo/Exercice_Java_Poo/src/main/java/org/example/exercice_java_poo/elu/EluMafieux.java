package org.example.exercice_java_poo.elu;

public class EluMafieux extends Elu{
    public EluMafieux(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void engageAssistant(Person assistant) {
        if(assistant.lastName.equals(this.lastName))
        {
            super.engageAssistant(assistant);
        }
        else System.out.println("Vous ne pouvez pas être embauché, vous ne faîtes pas l'affaire");
    }

    @Override
    public String toString() {
        return "EluMafieux{" +
                "assistants=" + assistants +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
