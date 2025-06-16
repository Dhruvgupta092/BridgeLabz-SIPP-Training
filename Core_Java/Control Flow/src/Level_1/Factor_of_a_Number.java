package Level_1;
import java.util.*;
public class Factor_of_a_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Number please enter the number which is greater tha 0");
		}
		int counter=1;
		while(counter<n) {
			if(n % counter ==0) {
				System.out.println(counter);
				counter++;
			}else {
				counter++;
			}
		}
	}

}
