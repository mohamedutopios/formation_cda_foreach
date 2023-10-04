package org.example.liste;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {
        // Démo pour Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector : "+vector);

        // Méthode pour vector
        System.out.println("1. Taille du vector :"+vector.size());
        System.out.println("2. Element à l'index 1 :"+vector.get(1));
        System.out.println("3. Est ce que l'element est present :"+vector.contains("Banana"));

        // Démo pour SortedSet
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("Javascript");
        sortedSet.add("Java"); // non ajouté car doublons
        System.out.println("SortedSet : "+sortedSet);

        // Methodes pour sorted set
        System.out.println("1. Premier element : "+sortedSet.first());
        System.out.println("2. Dernier element : "+sortedSet.last());
        SortedSet<String> headSet = sortedSet.headSet("Javascript");
        System.out.println("3. Sous-ensemble avant \"Javascript\" : " +headSet);

        // Démo pour LinkedList
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.65);
        linkedList.add(23.5);
        System.out.println(linkedList);

        // Méthodes pour linkedlist
        System.out.println("1. Premier element : "+linkedList.getFirst());
        System.out.println("2. Dernier element : "+linkedList.getLast());
        linkedList.removeFirst();
        System.out.println("3. Suppression du premier element : "+linkedList);

        // Démo pour sortedMap
        SortedMap<String,Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Java",44);
        sortedMap.put("Python",4);
        sortedMap.put("C++",22);
        System.out.println("SortedMap : "+sortedMap);

        // Méthode pour le sortedmap
        System.out.println("1. Clés de mon sortedMap :"+ sortedMap.keySet());
        System.out.println("1. Valeurs de mon sortedMap :"+ sortedMap.values());
        sortedMap.remove("Java");
        System.out.println("SortedMap : "+sortedMap);

        // Démo pour HashMap
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Java",44);
        hashMap.put("Python",4);
        hashMap.put("C++",22);
        System.out.println("Hashmap : "+hashMap);

        String csharp = "C#";
        int valueCSharp = 40;

        hashMap.put(csharp,valueCSharp);
        System.out.println(csharp.hashCode());

        // Méthodes pour le hashMap
        System.out.println("1. taille du hashmap : "+ hashMap.size());
        System.out.println("2. Valeur associé a la clé 'Python' : "+ hashMap.get("Python"));
        System.out.println("3. Vérification si clé 'toto' est presente "+hashMap.containsKey("toto"));
        hashMap.remove("Python");
        System.out.println("Hasmap apres suppression cle python "+hashMap);


    }
}
