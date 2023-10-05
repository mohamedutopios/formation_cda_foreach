package org.example.streams;

import org.example.array.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        List<String> prenoms = Arrays.asList("toto","aurelien","sylvain","adrien","christophe","mohammed","walter");

        System.out.println("Filtre (filter) :");
        prenoms.stream()
                .filter(p -> p.startsWith("a"))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Compter (count) : ");
        System.out.println("le nombre de personne dont le prenom commence par un a est de : "+ prenoms.stream()
                .filter(p -> p.startsWith("z"))
                .count());

        System.out.println();

        System.out.println("Distinct :");
        prenoms.stream().distinct().forEach(System.out::println);

        System.out.println();

        System.out.println("Limit :");
        prenoms.stream().limit(4).forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted :");
        prenoms.stream().sorted().forEach(System.out::println);
        System.out.println();
        System.out.println("Sorted inverse:");
        prenoms.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);







    }





}
