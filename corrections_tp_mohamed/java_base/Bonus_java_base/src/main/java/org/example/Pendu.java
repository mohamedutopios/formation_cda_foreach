package org.example;

public class Pendu {

    static Scanner sc = new Scanner(System.in);
    static int compteur = 10;


    public static void findWord()
    {
        //initialisation des variables
        String motRandom;
        String[] motCache;

        String[] tableauMots = {"acajou", "jouer", "adorer", "guerrier", "suer", "pseudonyme", "email", "chaise", "cahier", "tasse", "cigarette"};

        int longueur = tableauMots.length;

        motRandom = tableauMots[getRandom(0,longueur-1)];

        motCache = new String[motRandom.length()];

        for (int i = 0; i < motRandom.length(); i++) {
            tableauMots[i] = valueOf(motRandom.charAt(i));
            motCache[i] = "* ";
        }

        System.out.println("Le mot à deviner est " + String.join("", motCache));

        //anciennes lettres proposées
        ArrayList<Character> letters = new ArrayList<Character>();
        askLetter(motRandom, motCache, letters);

    }

    public static void askLetter(String motRandom, String[] motCache, ArrayList<Character> letters)
    {
        String[] proposition = new String[motRandom.length()];

        System.out.println("Donne moi une lettre : ");;
        String letter = sc.next().toLowerCase();

        boolean testPresence = motRandom.contains(letter);

        if(letters.contains(letter.charAt(0)))
        {
            System.out.println("Vous avez déjà proposé la lettre " + letter.charAt(0));
            askLetter(motRandom, motCache, letters);
        }

        else {
            letters.add(letter.charAt(0));
            if (!testPresence) {
                --compteur;
                System.out.println("Il vous reste " + compteur + " tentatives");
                proposition = motCache;
            } else {
                for (int i = 0; i < motRandom.length(); i++) {
                    if (letter.equals(valueOf(motRandom.charAt(i)))) {
                        proposition[i] = letter;
                    } else {
                        proposition[i] = motCache[i];
                    }

                }
            }

            motCache = proposition;
            String motTrouve = String.join("", motCache);


            if (compteur >= 1) {
                System.out.println(motTrouve);
            }

            if (!motTrouve.equals(motRandom)) {
                if (compteur == 0) {
                    System.out.println("Dommage, vous avez perdu ! Le mot a trouvé était " + motRandom);
                } else {
                    askLetter(motRandom, motCache, letters);
                }
            }

            if (String.join("", motCache).equals(motRandom)) {
                System.out.println("Bravo, vous avez trouvé le mot " + motRandom);
            }
        }
    }

    public static int getRandom(int min, int max)
    {
        return (int) Math.floor(Math.random() * (max - min) + min);
    }
}
