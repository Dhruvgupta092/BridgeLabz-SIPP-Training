package Level_1;
import java.util.*;
public class First_number_is_smallest_or_not {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number a:");
		int a= sc.nextInt();
		System.out.println("Enter the number b:");
		int b= sc.nextInt();
		System.out.println("Enter the number c:");
		int c= sc.nextInt();
		if(a<b && a<c) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
