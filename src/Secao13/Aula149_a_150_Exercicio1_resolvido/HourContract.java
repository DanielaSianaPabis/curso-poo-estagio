package Secao13.Aula149_a_150_Exercicio1_resolvido;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {

    }

    public HourContract(Date date, Double valuePerhour, Integer hours) {
        this. date = date;
        this.valuePerHour = valuePerhour;
        this. hours = hours;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValueperHour() {
        return valuePerHour;
    }

    public void setValueperHour(Double valueperHour) {
        this.valuePerHour = valueperHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
