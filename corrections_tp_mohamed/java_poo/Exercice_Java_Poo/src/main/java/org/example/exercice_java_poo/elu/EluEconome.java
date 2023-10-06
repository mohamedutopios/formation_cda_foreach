package org.example.exercice_java_poo.elu;

public class EluEconome extends Elu{

    float restMoney;

    public EluEconome( String firstName, String lastName) {
        super(lastName, firstName);
    }

    @Override
    public void sendDotation(float amount) {
        float amountToDispatch = amount/assistants.toArray().length;
        if(amountToDispatch > 1480)
        {
            for (Person p: assistants) {
                p.addMoney(1480);
                amount -= 1480;
            }
            this.accountAmount = amount;
        }
        else super.sendDotation(amount);
    }

    @Override
    public String toString() {
        return "EluEconome{" +
                "account=" + accountAmount +
                ", assistants=" + assistants +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
