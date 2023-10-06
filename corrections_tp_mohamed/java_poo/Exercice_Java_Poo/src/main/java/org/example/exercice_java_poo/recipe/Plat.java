package org.example.exercice_java_poo.recipe;

import java.util.ArrayList;

public class Plat implements Comparaison{

        protected String nom;
        protected ArrayList<Ingredient> ingredients;

        public Plat(String n)
        {
            this.nom = n;
            this.ingredients = new ArrayList<Ingredient>();
        }
        public String getNom(){
            return this.nom;
        }

        public ArrayList<Ingredient> getIngredients(){
            return this.ingredients;
        }

        public void addIngredient(Ingredient i){
            this.ingredients.add(i);
        }


    @Override
    public boolean equal(Object obj) {
        if(obj instanceof Plat)
        {
            int count = 0;
            if(((Plat) obj).ingredients.size() == (this.ingredients.size()))
            {
                for (Ingredient i : ((Plat) obj).ingredients) {
                    for (Ingredient i2 : this.ingredients)
                    {
                        if(i.equal(i2))
                        {
                            ++count;
                        }
                    }
                }
                return count == this.ingredients.size();
            }
        }
        return false;
    }
}
