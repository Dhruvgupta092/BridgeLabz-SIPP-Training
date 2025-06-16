package Level_2;
import java.util.*;
public class Distance_in_yards_and_miles {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of feet:");
		double feet = sc.nextDouble();
		double yard= 3*feet;
		double  mile= 1760*yard;
		System.out.println("the distance in yards is"+yard+"while the distance in miles is"+mile);

	}
}

