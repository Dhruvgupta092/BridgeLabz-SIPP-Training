package Level_1;
import java.util.*;
public class Print_odd_even_numbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if(n<0) {
			System.out.println("Invalid output please enter the number who is greater than 0");
		}
		else if(n ==0) {
			System.out.println("0 is neither a odd number nor a even number");
		}
		else if(n % 2 ==0) {
			for(int i=2;i<=n;i+=2) {
				System.out.println(i);
			}
		}
		else {
			for(int i=1;i<=n;i+=2) {
				System.out.println(i);
			}
		}
		

	}

}
//Question 14
//CP - Create a program to print odd and even numbers between 1 to the number entered by the user.
//Hint =>
//1. Get an integer input from the user, assign it to a variable number and check for Natural Number
//2. Using a for loop, iterate from 1 to the number
//3. In each iteration of the loop, print the number as odd or even number