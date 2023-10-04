package org.example;

import com.github.lalyos.jfiglet.FigletFont;
import org.example.array.Array;
import org.example.exercices.*;
import org.example.generique.Boite;
import org.example.operator.Operator;
import org.example.poo.Phone;
import org.example.poo.Product;
import org.example.poo.statique.User;
import org.example.readFromConsole.ReadFromConsole;
import org.example.string.ChaineCaractere;
import org.example.structure.Structure;
import org.example.structure.Structure2;
import org.example.variable.Variable;

import java.io.IOException;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws IOException {

        // Variable.getVariable();
        // Operator.getOperator();
        // Operator.getExepressionType();
        //Operator.getOperatorAndComparaison();
        // Structure.getSwitch();
        // ReadFromConsole.getReadWrite();
        // Exo1.getExercice3();3
        //  Structure2.getBoucleFor();
        // Structure2.getDoWhile();
        //Structure2.getBreakAndContinue();
        //Exo1.getExercice8();

        // ChaineCaractere.getMethodString();
        // ChaineCaractere.getComparaisonString();
        // ChaineCaractere.getFormat();
        //Array.getArray();
        // Exo3.getDecalage();
        //Exo3.exo3();
        //ExoString.getNbMots();
      /*  Product product = new Product();
        System.out.println(product);
        Product product1 = new Product(5, "telephone");
        System.out.println(product1);
        product1.setId(15);
        System.out.println(product1);
        System.out.println("le nom du produit est " + product1.getNom());
        product1.quiSuisJe();
        Product.getBonjour();*/

        /*Phone phone1 = new Phone(5,"iphone2",255);
       // System.out.println(phone1.getPrix());
        System.out.println(phone1);
        phone1.quiSuisjee();
        Phone.getBonjour();*/

//        User user = new User();
//        user.setName("Thomas");
//        User user1 = new User("Michel");
//        User user2 = new User("Tom");
//        System.out.println(user);
//        System.out.println(user1);
//        System.out.println(user2);
//
//        System.out.println(User.getCount());

        // Les type enumeres (enum)

//        enum JourSemaine {
//            LUNDI,MARDI,MERCREDI
//        }
//
//        JourSemaine today = JourSemaine.MERCREDI;
//
//        DayWeek tommorow = DayWeek.SAMEDI;
//
//        today = JourSemaine.MARDI;
//
//        System.out.println(today);
//        System.out.println(tommorow);

//        Boite<String> stringBoite = new Boite<String>("TOTO");
//        Boite<User> userBoite = new Boite<User>(new User("tata"));
//        stringBoite.getContenu();
//        userBoite.getContenu();
//
//        Hangar<User> userHangar = new Hangar<User>();
//        userHangar.addElement(new User("Titi"));
//        userHangar.addElement(new User("TOTO"));
//        System.out.println(userHangar.getAll());

        String acciiArt = FigletFont.convertOneLine("Hello ForEach !!!");

        System.out.println(acciiArt);



    }
}