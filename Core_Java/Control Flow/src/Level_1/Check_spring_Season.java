package Level_1;
import java.util.*;
public class Check_spring_Season {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int day = sc.nextInt();
		int Month = sc.nextInt();
		boolean is_Spring=(Month == 3 && day >=20 && day<=31)||
				(Month == 4 && day >=1 && day<=30) ||
				(Month == 5 && day >=1 && day<=31) ||
				(Month == 6 && day >=1 && day<=20);
		if(is_Spring) {
			System.out.println("Its a Spring Season");
		}
		else {
			System.out.println("Not a Spring Season");
		}
				
	}

}
