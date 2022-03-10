public class PartTimeEmployee extends Employee {

    private double ratePerHour, wage;
    private int hoursWorked;

    public void setWage(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.wage = (this.ratePerHour * this.hoursWorked);

    }

    public double getWage() {
        return wage;
    }
}