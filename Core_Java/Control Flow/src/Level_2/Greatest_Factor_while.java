package Level_2;
import java.util.*;
public class Greatest_Factor_while {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int GF= 1;
		int counter=n-1;
		while(counter>=1) {
			if(n % counter ==0) {
				GF= counter;
				
				break;
			}
			counter--;
		}
		System.out.println(GF);

	}

}
