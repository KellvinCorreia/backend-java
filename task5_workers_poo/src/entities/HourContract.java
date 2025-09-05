package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private int hours;

    public HourContract(Date date, Double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePerHour*hours;
    }

    @Override
    public String toString() {
        return "HourContract{" +
                "date=" + date +
                ", valuePerHour=" + valuePerHour +
                ", hours=" + hours +
                '}';
    }
}
