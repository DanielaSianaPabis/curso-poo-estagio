package Secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula98_Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marcos");

        System.out.println(list.size());

        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------- REMOVER ---------------");
        list.remove("Anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("---------------- ENCONTRAR ---------------");
        System.out.println("Index od Bob; " +list.indexOf("Bob"));
        System.out.println("Index od Bob; " +list.indexOf("Marcos"));

        System.out.println("---------------- FILTRAR ---------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------- ENCONTRAR PALVRAS PELO PREDICADO ---------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
