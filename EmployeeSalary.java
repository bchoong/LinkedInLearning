import java.util.Scanner;

// Input 1: number of hours the employee works per week
// Input 2: amount of money the employee makes per hour
// Output: employee's grosss yearly salary.
// Disregard taxes, 401(k) savings, etc
// Bonus: Add an input for vacation days. Vacation days are 8 hours each unpaid.

public class EmployeeSalary {

    public static double salaryCalculator(double hoursPerWeek,
                                          double moneyPerHour,
                                          double vacationDays) {
        if (hoursPerWeek < 0) {
            return -1;
        }
        if (moneyPerHour < 0) {
            return -1;
        }
        if (vacationDays < 0) {
            return - 1;
        }

        double weeklyPaycheck = hoursPerWeek * moneyPerHour;
        double unpaidTime = vacationDays * moneyPerHour * 8;
        return weeklyPaycheck * 52 - unpaidTime;
    }

    public static void main(String[] args) {
        double salary = salaryCalculator(-5,15,8);
        System.out.println(salary);
    }

}
