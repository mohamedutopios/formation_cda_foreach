package org.example.exercice_java_poo.recipe;

import java.util.Arrays;

public class Ingredient implements Comparaison {
        String nom_aliment;

        Etat[] etats;
        int quantite;
        String unite;
        public Ingredient(String n, Etat[] e, int q, String unite){
            this.nom_aliment = n;
            this.etats = e;
            this.quantite = q;
            this.unite = unite;
        }

    @Override
    public boolean equal(Object o) {
            if(o instanceof Ingredient)
            {
                return ((Ingredient) o).nom_aliment.equals(this.nom_aliment) && Arrays.equals(((Ingredient) o).etats, this.etats);
            }
        return false;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "nom_aliment='" + nom_aliment + '\'' +
                ", etats=" + Arrays.toString(etats) +
                ", quantite=" + quantite +
                ", unite='" + unite + '\'' +
                '}';
    }
}
