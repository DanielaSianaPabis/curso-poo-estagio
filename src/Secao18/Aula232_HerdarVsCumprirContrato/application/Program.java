package Secao18.Aula232_HerdarVsCumprirContrato.application;

import Secao18.Aula232_HerdarVsCumprirContrato.model.entities.AbstractShape;
import Secao18.Aula232_HerdarVsCumprirContrato.model.entities.Circle;
import Secao18.Aula232_HerdarVsCumprirContrato.model.entities.Rectangle;
import Secao18.Aula232_HerdarVsCumprirContrato.model.enums.Color;

public class Program {
    public static void main(String[] args) {

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
    }
}
