package Level_1;
import java.util.*;
public class Person_Can_Vote_or_Not {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("the person age is"+age+"he is eligible for vote");
		}
		else {
			System.out.println("the person age is"+age+"he is  not eligible for vote");
		}
	}

}
