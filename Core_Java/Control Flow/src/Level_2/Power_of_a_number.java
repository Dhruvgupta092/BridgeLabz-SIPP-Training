package Level_2;
import java.util.*;
public class Power_of_a_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result =1;
		for(int i=1;i<= power;i++) {
			result *= number;
		}
		 System.out.println(number + " raised to the power " + power + " is: " + result);

	}

}
