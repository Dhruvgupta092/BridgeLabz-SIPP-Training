package Level_2;
import java.util.*;
public class Power_while {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result =1;
		int i=1;
		while(i<= power) {
			result *= number;
			i++;
		}
		 System.out.println(number + " raised to the power " + power + " is: " + result);

	}

}
