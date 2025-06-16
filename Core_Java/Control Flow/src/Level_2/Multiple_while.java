package Level_2;
import java.util.*;
public class Multiple_while {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0 || n>100) {
			System.out.println("Invalid output");
		}
		int i=100;
		while(i>=1) {
			if(n % i ==0) {
				System.out.println(i);
				
				
			}
			i--;
		}

	}

}