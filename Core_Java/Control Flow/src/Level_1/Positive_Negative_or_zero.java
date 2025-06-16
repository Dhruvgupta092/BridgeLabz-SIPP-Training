package Level_1;
import java.util.*;
public class Positive_Negative_or_zero {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		if(a>0) {
			System.out.println("the no. is positive");
		}
		else if(a<0) {
			System.out.println("the no. is Negative");
		}
		else if(a==0) {
			System.out.println("the no. is Zero");
		}
		
	}

}
