package Level_3;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = first / second;
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println("Result: " + result);
    }
}