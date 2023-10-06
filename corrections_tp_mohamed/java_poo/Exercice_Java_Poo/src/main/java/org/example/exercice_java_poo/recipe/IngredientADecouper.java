package org.example.exercice_java_poo.recipe;

public class IngredientADecouper extends Ingredient{
    public IngredientADecouper(String n, Etat[] e, int q, String unite) {
        super(n, e, q, unite);
    }

    public void decouper()
    {
        this.etats = new Etat[]{Etat.DECOUPE};
    }
}
