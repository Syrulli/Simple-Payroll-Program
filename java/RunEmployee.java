import java.util.*;
public class RunEmployee {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        FullTimeEmployee ftEmployee = new FullTimeEmployee();
        PartTimeEmployee ptEmployee = new PartTimeEmployee();

        System.out.print("Enter name: ");
        String name = scan.nextLine();

        System.out.println("Press F for Full Time or P for Part Time: ");
        String empType = scan.nextLine();

        if (empType.equals("F")) {

            ftEmployee.setName(name);

            System.out.println("Enter monthly salary: ");
            double salary = scan.nextDouble();

            ftEmployee.setMonthlySalary(salary);

            System.out.println("Name: " + ftEmployee.getName());
            System.out.println("Wage: " + ftEmployee.getMonthlySalary());

        } else if (empType.equals("P")) {

            ptEmployee.setName(name);

            System.out.println("Enter rate per hour and no. of hours worked separated by space: ");
            double ratePerHour = scan.nextDouble();
            int hoursWorked = scan.nextInt();

            ptEmployee.setWage(ratePerHour, hoursWorked);

            System.out.println("Name: " + ptEmployee.getName());
            System.out.println("Wage: " + ptEmployee.getWage());

        } else {

            System.out.println("You entered a wrong input! Please try again.");

        }

    }

}



