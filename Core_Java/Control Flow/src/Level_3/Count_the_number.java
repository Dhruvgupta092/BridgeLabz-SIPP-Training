package Level_3;
import java.util.*;
public class Count_the_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int count =0;
		if (n == 0) {
            count = 1;
		}
		else {
			while(n !=0) {
				n /=10;
				count ++;
			}
		}
		System.out.println(count);
		
		
	}

}
//Create a program to count the number of digits in an integer.
//Hint => 
//Get an integer input for the number variable.
//Create an integer variable count with value 0.
//Use a loop to iterate until number is not equal to 0.
//Remove the last digit from number in each iteration
//Increase count by 1 in each iteration.
//Finally display the count to show the number of digits

