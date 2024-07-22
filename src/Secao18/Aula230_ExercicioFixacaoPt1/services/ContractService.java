package Secao18.Aula230_ExercicioFixacaoPt1.services;

import Secao18.Aula230_ExercicioFixacaoPt1.entities.Contract;
import Secao18.Aula230_ExercicioFixacaoPt1.entities.Installment;

import java.time.LocalDate;
import java.util.Locale;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota  + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }

    }
}
