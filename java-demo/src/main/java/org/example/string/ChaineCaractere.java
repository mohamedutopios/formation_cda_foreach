package org.example.string;

import java.util.Arrays;

public class ChaineCaractere {


    public static void getMethodString() {
        String s = " hello ";
        System.out.println("s.length() " + s.length());
        System.out.println("s.contains() " + s.contains("he"));
        System.out.println("s.uppercase " + s.toUpperCase());
        System.out.println("s.startWith() "  + s.startsWith(" "));
        System.out.println("s.endWith() " + s.endsWith(" "));
        System.out.println("s.replace() " + s.replace("ll", "LL"));
        System.out.println("s.trim() " + s.trim());
        System.out.println("s.substring() " + s.substring(0,3));
        System.out.println("Arrays.toString(s.toCharArray()) " + Arrays.toString(s.toCharArray()));
        System.out.println("s.charAt() " + s.charAt(1));
        System.out.println("Arrays.toString(s.split()) " + Arrays.toString(s.split("e")));

    }

    public static void getComparaisonString() {


        String s = " hello ";
        String s2 = " hello ";

        System.out.println("s == s2 " + (s == s2));

        String s3 = new String(" hello ");

        System.out.println("s == s3 " + (s == s3));

        System.out.println("s.equals(s3) " + s.equals(s3));

        String nom = "Yacine";
        String nom1 = "yacine";

        System.out.println("nom.equals(nom1) " + nom.equals(nom1));
        System.out.println("nom.equalsIgnoreCase(nom1) " + nom.equalsIgnoreCase(nom1));

    }

        public static void getFormat(){


        String firstName = "Alain";

        String journee = "Morning";

        String phrase = "Salut, %s ! , good %s !";

        String formatage = String.format(phrase,firstName,journee);

        System.out.println(formatage);




        }


}
