package service;

import entities.Contract;
import entities.Installment;
import interfaces.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {

        Double installmentValue = contract.getTotalValue() / months;
        LocalDate date = contract.getDate().plusDays(30);

        for (int i = 1; i <= months; i++) {

            Double valueInstallment = taxPayment(installmentValue, i);

            Installment installment = new Installment(valueInstallment, date);

            contract.addInstallment(installment);

            date = date.plusDays(30);
        }

    }

    public Double taxPayment(Double installmentValue, Integer months) {

        Double interest = onlinePaymentService.interest(installmentValue, months);
        Double paymentFee = onlinePaymentService.paymentFee(installmentValue + interest);

        return installmentValue + paymentFee + interest;
    }

}
