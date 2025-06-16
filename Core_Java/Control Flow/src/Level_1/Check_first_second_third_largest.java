package Level_1;
import java.util.*;
public class Check_first_second_third_largest {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number a:");
		int a= sc.nextInt();
		System.out.println("Enter the number b:");
		int b= sc.nextInt();
		System.out.println("Enter the number c:");
		int c= sc.nextInt();
		if(a>b && a>c) {
			System.out.println("the first largest number is a:"+a);
			if(b>c) {
				System.out.println("the second largest number is b:"+b);
				System.out.println("the third largest number is c:"+c);
			}
			else {
				System.out.println("the second largest number is c:"+c);
				System.out.println("the third largest number is b:"+b);
			}
		}
		else if(b>a && b>c) {
			System.out.println("the first largest number is b:"+b);
			if(a>c) {
				System.out.println("the second largest is a:"+a);
				System.out.println("the third largest is c:"+c);
			}
			else {
				System.out.println("the second largest number is c:"+c);
				System.out.println("the third largest number is a:"+a);
			}
		}
		else if(c>b && c>a) {
			System.out.println("the first largest number is c:"+c);
			if(b>a) {
				System.out.println("the second largest is b:"+b);
				System.out.println("the third largest is a:"+a);
			}
			else {
				System.out.println("the second largest number is a:"+a);
				System.out.println("the third largest number is b:"+b);
			}
		}

	}

}
