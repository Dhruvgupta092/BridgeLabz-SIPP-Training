package Level_2;
import java.util.*;
public class Factors_while {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Number please enter the number which is greater tha 0");
		}
		
		for(int counter=1;counter<n;counter++) {
			if(n % counter ==0) {
				System.out.println(counter);
				
			}else {
				
			}
		}
	}

}
