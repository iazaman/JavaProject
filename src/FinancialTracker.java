import java.util.Scanner;

public class FinancialTracker {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Input user data
            System.out.print("Enter your monthly income: ");
            double income = scanner.nextDouble();

            System.out.print("Enter your monthly rent: ");
            double rent = scanner.nextDouble();

            System.out.print("Enter your monthly utilities: ");
            double utilities = scanner.nextDouble();

            System.out.print("Enter your monthly groceries expenses: ");
            double groceries = scanner.nextDouble();

            System.out.print("Enter your monthly entertainment expenses: ");
            double entertainment = scanner.nextDouble();

            System.out.print("Enter your monthly transportation expenses: ");
            double transportation = scanner.nextDouble();

            System.out.print("Enter your savings goal (percentage of income): ");
            double savingsGoalPercentage = scanner.nextDouble();

            // Step 2: Calculate total monthly expenses
            double totalExpenses = rent + utilities + groceries + entertainment + transportation;

            // Step 3: Calculate actual savings
            double actualSavings = income - totalExpenses;

            // Step 4: Calculate goal amount from percentage
            double goalAmount = income * (savingsGoalPercentage / 100);

            // Step 5: Compare actual savings to goal amount
            System.out.println("\nMonthly Income: $" + income);
            System.out.println("Total Expenses: $" + totalExpenses);
            System.out.println("Actual Savings: $" + actualSavings);
            System.out.println("Savings Goal: $" + goalAmount);

            if (actualSavings >= goalAmount) {
                System.out.println("\nYou have met or exceeded your savings goal!");
            } else {
                System.out.println("\nYou have not met your savings goal.");
                System.out.println("You need to save an additional $" + (goalAmount - actualSavings) + " to meet your goal.");
                System.out.println("Consider reducing expenses like entertainment or groceries to reach your target.");
            }


            scanner.close();
        }
}
