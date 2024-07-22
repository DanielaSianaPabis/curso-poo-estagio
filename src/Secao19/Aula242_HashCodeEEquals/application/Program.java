package Secao19.Aula242_HashCodeEEquals.application;

import Secao19.Aula242_HashCodeEEquals.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria","maria@gmail.com");
        Client c2 = new Client("Maria","maria@gmail.com");
        Client c3 = new Client("Alex","alex@gmail.com");

        //String s1 = "test";
        //String s2 = "test";

        String s01 = new String("test");
        String s02 = new String("test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); // == compara a referencia de memoria (a posicao), nao o conteudo, por isso deu false

        System.out.println(s01 == s02);
    }

}
