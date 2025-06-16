package Level_2;
import java.util.*;
public class Bonus_of_employee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
		System.out.println("Enter the year of experience");
		int year_of_experience= sc.nextInt();
		int c= (salary*5)/100;
		if(year_of_experience>5) {
			salary += c;
			System.out.println("the bonus ammount is"+c+"the salaty with bonus is "+salary);
		}
		else {
			System.out.println(" for bonus u have to gain some experience");
		}
		
	}

}