package Level_1;
import java.util.*;
public class Bonus_of_Employee {

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
//Create a program to find the bonus of employees based on their years of service.
//Hint => 
//Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
//Take salary and year of service in the year as input.
//Print the bonus amount.
