package org.example.exercice_java_poo.ONF;

import java.util.ArrayList;
import java.util.List;

public class Parcelle {
    private static int count = 0;
    private int id;

    private int surface;
    private List<Arbre> arbres = new ArrayList<Arbre>();

    public Parcelle(int surface) {
        this.id =  ++count;
        this.surface = surface;
    }

    public Parcelle(int id, int surface) {
        this.id = id;
        this.surface = surface;
    }

    public int getId() {
        return id;
    }

    public int getSurface() {
        return surface;
    }

    public int getArbres() {
        return arbres.size();
    }

    public void addArbre(Arbre a)
    {
        this.arbres.add(a);
    }

    @Override
    public String toString() {
        return "Parcelle{" +
                "id=" + id +
                ", surface=" + surface +
                ", arbres =" + arbres +
                '}';
    }
}
