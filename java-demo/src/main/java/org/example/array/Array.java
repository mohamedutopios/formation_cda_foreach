package org.example.array;

public class Array {

    public static void getArray() {
        int[] tab;
        int tab2[];
        tab = new int[10];
        String[] tab3 = new String[5];
        int[] tab4 = {1,8,9,25};
        //System.out.println(tab4.length);
        int[][] matrice = {{12,45,89},{45,87,65}};

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i+1;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }






}
