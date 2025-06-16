package Level_3;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum =0;
		int OV = n;
		while(OV != 0) {
			int rem= OV % 10;
			sum += rem*rem*rem;
			
			OV = OV/10;
			
			 
			
		}
		if(sum == n) {
			System.out.println("armstrong no.");
		}
		else {
			System.out.println("not a armstrong no.");
		}

	}

}
