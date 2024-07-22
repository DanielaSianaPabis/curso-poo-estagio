package Secao18.Aula226_SolucaoProblemaPt2.application;

import Secao18.Aula226_SolucaoProblemaPt2.model.entities.CarRental;
import Secao18.Aula226_SolucaoProblemaPt2.model.entities.Vehicle;
import Secao18.Aula226_SolucaoProblemaPt2.model.services.BrazilTaxService;
import Secao18.Aula226_SolucaoProblemaPt2.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("\nFATURA:");
        System.out.printf("Pagamento básico: "+ String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.printf("\nImposto: "+ String.format("%.2f", cr.getInvoice().getTax()));
        System.out.printf("\nPagamento total: "+ String.format("%.2f", cr.getInvoice().getTotalPayment()));


        sc.close();
    }
}
