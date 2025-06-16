package Level_2;
import java.util.*;
public class Calculate_total_price {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double unit_Price= sc.nextDouble();
		int quantity= sc.nextInt();
		double Total_Price= unit_Price * quantity;
		System.out.println("The total purchase price is INR"+Total_Price+"if the quantity"+quantity+" and unit price is INR"+unit_Price);
		
	}

}
//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
//Hint => NA
//I/P => unitPrice, quantity
//O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___