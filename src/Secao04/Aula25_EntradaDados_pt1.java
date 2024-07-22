package Secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula25_EntradaDados_pt1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char c;
        String x;
        int y;
        double z;

        c = sc.next().charAt(0);
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
