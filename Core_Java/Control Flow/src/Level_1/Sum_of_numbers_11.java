package Level_1;
import java.util.*;
public class Sum_of_numbers_11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double total =0.0;
		while(true) {
			System.out.println("Enter the number");
			double number = sc.nextDouble();
			if(number<0) {
				break;
			}
			total += number;
		}
		System.out.println("Total value is "+total);
		

	}

}
