package application;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        Integer integer = scanner.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), dateTimeFormatter);

        System.out.print("Valor do contrato: ");
        Double valueContract = scanner.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        Integer numberMonths = scanner.nextInt();


        Contract contract = new Contract(integer, date, valueContract);

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, numberMonths);

        List<Installment> installments = contract.getInstallment();

        System.out.println("Parcelas:");
        for(Installment x : installments){
            System.out.println(x.toString());
        }

    }

}
