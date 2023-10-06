package org.example.exercice_java_poo.elu;

public class EluEscroc extends Elu{
    private float accountSwitz;

    public EluEscroc(String firstName, String lastName) {
        super(lastName, firstName);
    }

    public float getAccountSwitz() {
        return accountSwitz;
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
            this.accountSwitz += amount;
        }
        else super.sendDotation(amount);
    }

    @Override
    public String toString() {
        return "EluEscroc{" +
                "accountSwitz=" + accountSwitz +
                ", assistants=" + assistants +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
