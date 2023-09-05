package org.example.structure;

public class Structure2 {

    public static void getBoucleFor() {

        int[] tab = {1,5,8};
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            System.out.println("i = " + i + ", valeur tab " + tab[i]);
        }
        for (int i = 0, j = 10; i < j ; i++,j--) {
            System.out.println("i : "+ i +", j : " + j);
        }

        for (int numb:tab) {
            sum += numb;
        }
        System.out.println("La somme du tableau est : " + sum);

    }

    public static void getDoWhile(){

        int i = 1;

        while (i<=5){
            System.out.println("i : " + i);
            i++;
        }

    }


}
