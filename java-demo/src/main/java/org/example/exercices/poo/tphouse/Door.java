package org.example.exercices.poo.tphouse;

public class Door {
    protected String color;

    public Door(){
        color = "bleu";
    }

    public Door(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display()
    {
        System.out.println("Je suis une porte, ma couleur est "+ color +".");
    }


}
