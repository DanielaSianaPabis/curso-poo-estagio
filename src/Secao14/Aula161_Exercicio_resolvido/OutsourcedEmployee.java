package Secao14.Aula161_Exercicio_resolvido;

public class OutsourcedEmployee extends Employee {
    private Double additionnalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionnalCharge) {
        super(name, hours, valuePerHour);
        this.additionnalCharge = additionnalCharge;
    }

    public Double getAdditionnalCharge() {
        return additionnalCharge;
    }

    public void setAdditionnalCharge(Double additionnalCharge) {
        this.additionnalCharge = additionnalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionnalCharge * 1.1;
    }
}
