import java.util.Scanner;

public class calcul{

    public static void main(String[] args) {
        double numberOne;
        double numberTwo;
        double result;
        char op;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        numberOne = reader.nextDouble();
        numberTwo = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                result = numberOne / numberTwo;
                break;

        }

    }
}
