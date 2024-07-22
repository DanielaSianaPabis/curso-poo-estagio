package Secao08.Aulas63_a_65_UsoDeMetodosParaReaproveitamento;

public class Aula64_Triangle {
    public double a;
    public double b;
    public double c;
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
