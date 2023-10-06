package org.example.exercice_java_poo.recipe;

public class IngredientACuire extends Ingredient{

    int temperatureCuisson;

    public IngredientACuire(String n, Etat[] e, int q, String unite, int t) {
        super(n, e, q, unite);
        this.temperatureCuisson = t;
    }

    public void cuire()
    {
        this.etats = new Etat[]{Etat.CUIT};
    }
}
