package Level_1;
import java.util.*;
public class Fees_Discount_Calculator {
	public static void main(String[] args) {
        double fee, discountPercent;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, finalFee);
    }
}
