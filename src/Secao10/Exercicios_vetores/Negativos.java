package Secao10.Exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar?");
        int N = sc.nextInt();
        int[] vect = new int[N];

        for(int i=0; i< vect.length; i++) {
            System.out.print("Digite um numero:");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS NEGATIVOS:");
        for(int i=0; i< vect.length; i++) {
            if(vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
