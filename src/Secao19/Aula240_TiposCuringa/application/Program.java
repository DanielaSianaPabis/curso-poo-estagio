package Secao19.Aula240_TiposCuringa.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria","Alex","Bob");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        //list.add(3); nao pode adicionar, pois List<?> nao sabe que tipo 3 é
        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}
