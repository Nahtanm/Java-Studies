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

        for (int i = 1; i <= months; i++) {

            LocalDate date = contract.getDate().plusMonths(i);

            Double valueInstallment = taxPayment(installmentValue, i);

            contract.addInstallment(new Installment(valueInstallment, date));

        }

    }

    public Double taxPayment(Double installmentValue, Integer months) {

        Double interest = onlinePaymentService.interest(installmentValue, months);
        Double paymentFee = onlinePaymentService.paymentFee(installmentValue + interest);

        return installmentValue + paymentFee + interest;
    }

}
