package Level_2;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a= sc.nextInt();
		System.out.println("Enter the value of b:");
		int b= sc.nextInt();
		int c= a+b;
		System.out.println("Addition of two numbers:"+c);
		int d= a-b;
		System.out.println("Subtraction of two numbers:"+d);
		int e= a*b;
		System.out.println("Multiplication of two numbers:"+e);
		double f= a/b;
		System.out.println("Division of two numbers:"+f);
	}

}
