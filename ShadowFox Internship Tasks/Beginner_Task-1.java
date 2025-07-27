import java.util.Scanner;

public class EnhancedCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Enhanced Calculator Menu =====");
            System.out.println("1. Basic Arithmetic Operations.");
            System.out.println("2. Scientific Calculations.");
            System.out.println("3. Unit Conversions.");
            System.out.println("4. Exit.");
            System.out.print("Enter your Choice: \n");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    basicArithmetic();
                    break;
                case 2:
                    scientificOperations();
                    break;
                case 3:
                    unitConversions();
                    break;
                case 4:
                    System.out.println("Thanks For Using My Enhanced Calculator!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option!");
            }
        } while (choice != 4);
    }

    static void basicArithmetic() {
        System.out.println("\n--- Basic Arithmetic Operations ---");
        System.out.print("Enter First Number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select Operation: + - * / %");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Addition = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("Division = " + (num1 / num2));
                else
                    System.out.println("Error: Division by Zero is not Allowed.");
                break;
            case '%':
                if (num2 != 0)
                    System.out.println("Modulo = " + (num1 % num2));
                else
                    System.out.println("Error: Division by Zero is not Allowed.");
                break;
            default:
                System.out.println("Invalid Operation Symbol!");
        }
    }

    static void scientificOperations() {
        System.out.println("\n--- Scientific Operations ---");
        System.out.println("1. Square Root");
        System.out.println("2. Power");
        System.out.print("Choose an operation: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println();
                System.out.print("Enter a number: ");
                double num = scanner.nextDouble();
                if (num >= 0)
                    System.out.println("Square Root = " + Math.sqrt(num));
                else
                    System.out.println("Error: Cannot find square root of negative number.");
                break;
            case 2:
                System.out.println();
                System.out.print("Enter the Base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the Exponent: ");
                double exp = scanner.nextDouble();
                System.out.println("Power Value = " + Math.pow(base, exp));
                break;
            default:
                System.out.println("Invalid Option!");
        }
    }

    static void unitConversions() {
        System.out.println("\n--- Unit Conversions ---");
        System.out.println("1. Celsius to Fahrenheit.");
        System.out.println("2. Fahrenheit to Celsius.");
        System.out.println("3. INR to USD.");
        System.out.println("4. USD to INR.");
        System.out.print("Choose a Conversion: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println();
                System.out.print("Enter Celsius: ");
                double c = scanner.nextDouble();
                System.out.println("Fahrenheit Value = " + ((c * 9 / 5) + 32));
                break;
            case 2:
                System.out.println();
                System.out.print("Enter Fahrenheit: ");
                double f = scanner.nextDouble();
                System.out.println("Celsius Value = " + ((f - 32) * 5 / 9));
                break;
            case 3:
                System.out.println();
                System.out.print("Enter Amount in INR: ");
                double inr = scanner.nextDouble();
                System.out.println("USD Amount = " + (inr / 83.0));
                break;
            case 4:
                System.out.println();
                System.out.print("Enter Amount in USD: ");
                double usd = scanner.nextDouble();
                System.out.println("INR Amount = " + (usd * 83.0));
                break;
            default:
                System.out.println("Invalid Conversion Choice!");
        }
    }
}

