package Level_2;
import java.util.*;
public class Quotient_and_Remainder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number a:");
		int a= sc.nextInt();
		System.out.println("Enter the number b:");
		int b= sc.nextInt();
		int Quotient= a/b;
		int Remainder = a%b;
		System.out.println(" The Quotient is"+Quotient+" and Reminder is "+Remainder+"of two number "+a+"and"+b);
	}

}
//
//Write a program to take 2 numbers and print their quotient and reminder
//Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
//I/P => number1, number2
//O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
