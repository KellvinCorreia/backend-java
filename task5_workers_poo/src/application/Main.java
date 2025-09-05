package application;

import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("kellvin", WorkerLevel.MID_LEVEL,1200.00);
        Worker worker2 = new Worker("correia", WorkerLevel.JUNIOR,850.00);

        HourContract contract1 = new HourContract(new Date(),25.00,8);
        HourContract contract2 = new HourContract(new Date(),22.00,6);

        worker1.addContract(contract1);
        List<HourContract> worker1Contracts = worker1.getContracts();
        System.out.println(worker1);
        System.out.println(worker1Contracts.get(0).totalValue());

    }
}