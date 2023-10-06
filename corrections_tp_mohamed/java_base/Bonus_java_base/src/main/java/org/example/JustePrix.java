package org.example;

public class JustePrix {


    static Scanner sc = new Scanner(System.in);
    public static void findNumber(){

        int justePrix, nbPropose;


        justePrix = getRandom(1,1000);

        //affichage du bon nombre
         System.out.println(justePrix);
        nbPropose = getProposition();

        int tentatives = 1;

        while(nbPropose!=justePrix)
        {
            if(nbPropose>justePrix)
            {
                System.out.println("Plus petit !");
                nbPropose = getProposition();
            }
            else
            {
                System.out.println("Plus grand !");
                nbPropose = getProposition();
            }
            tentatives++;
        }

        System.out.println("Vous avez trouvé, le juste prix était de : " + justePrix);
        System.out.println("Vous avez trouvé en " + tentatives + " tentatives");
    }

    public static int getRandom(int min, int max)
    {
        return (int) (Math.random() * (max - min +1) + min);
    }

    public static int getProposition()
    {
        System.out.println("Devinez le prix (entre 1 et 1000), votre proposition : ");
        return sc.nextInt();
    }
}
