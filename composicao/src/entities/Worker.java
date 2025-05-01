package entities;

import enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Worker {

     private String name;
     private WorkerLevel workerLevel;
     private Double baseSalary;
     private Departament departament;
     private List<HourContract> hourContractList;

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Departament departament) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.departament = departament;
        this.hourContractList = new ArrayList<>();
    }

    public Worker() {
    }

    public void addContract(HourContract contract){
        this.hourContractList.add(contract);
    }

    public void removeContract(HourContract contract){
        this.hourContractList.remove(contract);
    }

    public Double income(Integer year, Integer month){
        Double sum = 0.00;
        for (HourContract x : hourContractList){
            if((x.getDate().getYear() == year) && (x.getDate().getMonthValue() == month)){
                sum += x.totalValue();
            }
        }

        return sum + this.baseSalary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", workerLevel=" + workerLevel +
                ", baseSalary=" + baseSalary +
                ", departament=" + departament +
                ", hourContractList=" + hourContractList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getHourContractList() {
        return hourContractList;
    }

}



