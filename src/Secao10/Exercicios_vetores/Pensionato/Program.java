package Secao10.Exercicios_vetores.Pensionato;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] vect = new Rent[10];

        for(int i=0; i<n; i++) {
            System.out.println("\nRENT #"+(i+1)+":");
            System.out.print("Name: ");
            String nome = sc.next();

            System.out.print("E-mail: ");
            String email = sc.next();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(nome, email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for(int i=0; i<10; i++) {
            if(vect[i]!=null) {
                System.out.println(i+": "+vect[i]);
            }
        }

        sc.close();
    }
}
