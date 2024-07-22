package Secao18.Aula230_ExercicioFixacaoPt1.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
