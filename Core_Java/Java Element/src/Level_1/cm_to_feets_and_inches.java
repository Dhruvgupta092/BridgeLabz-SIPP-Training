package Level_1;
import java.util.*;
public class cm_to_feets_and_inches {
	public static void main(String[] args) {
        double heightCm;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);
    }
}
