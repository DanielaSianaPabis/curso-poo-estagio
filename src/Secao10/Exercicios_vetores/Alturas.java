package Secao10.Exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;
public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int N = sc.nextInt();
        String nome[] = new String[N];
        int idade[] = new int[N];
        double altura[] = new double[N];

        for(int i=0; i<N; i++) {
            System.out.println("Dados da "+(i+1)+"° pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.next();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();

        }
        double sum = 0.0;
        double sum2 = 0.0;
        for(int i=0; i<N; i++) {
            sum += altura[i];
            if(idade[i]<16) {
                sum2++;
            }
        }
        double avg = sum/N;
        System.out.printf("Altura media: %.2f%n",avg);
        double percent = (sum2*100.00)/N;
        System.out.println("Pessoas com menos de 16 anos: "+percent+"%");

        for(int i=0; i< nome.length; i++) {
            if(idade[i]<16) {
                System.out.println(nome[i]);
            }
        }

        sc.close();

    }
}
