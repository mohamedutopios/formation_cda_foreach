package org.example;

public class GestionNotes {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Float> notes = new ArrayList<>();

    //format décimal
    static DecimalFormat double_decimal = new DecimalFormat("#.##");
    public static void proposition(){

        String[] propositions = {"1- Stocker les notes des élèves dans un tableau", "2- Afficher la liste des notes", "3- Modifier une note", "4- Afficher la moyenne d'une classe", "5- Afficher la note la plus élevée", "6- Afficher la note la plus basse", "0- Quitter le programme"};

        String answer;

        for (String prop : propositions) {
            System.out.println(prop);
        }
        System.out.println("Que désirez-vous faire ?");

        answer = sc.next();

        switch (answer)
        {
            case "1" -> {
                remplirTableau(notes);
                proposition();
            }
            case "2" -> {
                afficherListe(notes);
                proposition();
            }
            case "3" -> {
                modifierNote(notes);
                proposition();
            }
            case "4" -> {
                calculMoyenne(notes);
                //proposition();
            }
            case "5" -> {
                calculMax(notes);
                proposition();
            }
            case "6" -> {
                calculMin(notes);
                proposition();
            }
            case "0" -> {
                break;
            }
            default -> {
                System.out.println("Je n'ai pas compris votre demande ");
                proposition();
            }
        }
    }

    public static void remplirTableau(ArrayList<Float> notes)
    {
        System.out.println("Combien de notes comportent le tableau ? ");
        int longueur = sc.nextInt();

        for (int i = 0; i < longueur; i++)
        {
            float note;
            do
            {
                System.out.println("Entrez la note " + (i+1) + " de votre tableau : ");
                note = Float.parseFloat(sc.next());
            }while(note>20 || note<0);

            notes.add(note);
        }
    }

    public static void afficherListe(ArrayList<Float> notes)
    {
        System.out.println(notes);
    }

    public static void modifierNote(ArrayList<Float> notes)
    {
        int modifSupp;
        do
        {
            System.out.println("Souhaitez-vous modifier ou suppprimer une note ? 1- La modifier, 2- La supprimer  : ");
            modifSupp = sc.nextInt();
        }while(modifSupp < 1 || modifSupp > 2);

        System.out.println("Quelle est le numéro de la note que vous souhaitez modifier/ supprimer ? ");
        int modification = sc.nextInt();

        //Verifier numéro existant dans le tableau
        if(modification > notes.toArray().length || modification < 1 )
        {
            do
            {
                System.out.println("Saisie incorrecte, note inexistante \n Quel est le numéro de la note que vous souhaitez modifier/ supprimer ? ");
                modification = sc.nextInt();
            } while(modification > notes.toArray().length || modification < 1);
        }

        if(modifSupp == 1)
        {
            System.out.println("Quelle est la nouvelle note numéro " + modification + " ? ");
            float newNote = sc.nextInt();
            notes.set(modification - 1, newNote);
            System.out.println("La note numéro " + modification + " a bien été modifié");
            proposition();
        }
        else
        {
            notes.remove(modification-1);
            System.out.println("La note numéro " + modification + " a bien été supprimé ");
            proposition();
        }
    }

    public static void calculMoyenne(ArrayList<Float> notes)
    {
        float moy, somme = 0;

        for (int i = 0; i < notes.size(); i++)
        {
            somme = somme + notes.get(i);
        }

        moy = (somme / (notes.size()));



        System.out.println("La moyenne de la classe est de : " + double_decimal.format(moy));
        proposition();
    }

    public static void calculMax(ArrayList<Float> notes)
    {
        float max = notes.get(0);

        for (int i = 1; i < notes.size() ; i++) {
            if(notes.get(i) > max )
                max = notes.get(i);
        }

        System.out.println("La note la plus élevée de la classe est de " + double_decimal.format(max));
    }

    public static void calculMin(ArrayList<Float> notes)
    {
        float min = notes.get(0);

        for (int i = 1; i < notes.size() ; i++) {
            if(notes.get(i) < min )
                min = notes.get(i);
        }

        System.out.println("La note la plus basse de la classe est de " + double_decimal.format(min));
    }
}
