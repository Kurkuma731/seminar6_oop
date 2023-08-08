import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public double getNumberInput() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public String getOperatorInput() {
        System.out.print("Enter an operator (+, -, *, /): ");
        return scanner.next();
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}