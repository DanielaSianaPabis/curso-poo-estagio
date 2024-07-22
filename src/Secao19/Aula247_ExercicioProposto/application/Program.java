package Secao19.Aula247_ExercicioProposto.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.print("How many students for course B? ");
        amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            int number = sc.nextInt();
            b.add(number);
        }

        System.out.print("How many students for course C? ");
        amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            int number = sc.nextInt();
            c.add(number);
        }

        Set<Integer> totalValue = new HashSet<>(a);
        totalValue.addAll(b);
        totalValue.addAll(c);

        System.out.println("Total students: " + totalValue.size());

        sc.close();
    }
}
