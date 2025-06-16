package Level_2;
import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if(n<0) {
			System.out.println("Invalid number please enter the number who is greater than 0");
		}
		System.out.println(n);
		if(n%3==0) {
			System.out.print("Fizz");
		}
		if(n%5 ==0) {
			System.out.print("Buzz");
		}
		}

}
