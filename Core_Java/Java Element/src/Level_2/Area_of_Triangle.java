package Level_2;
import java.util.*;
public class Area_of_Triangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double base= sc.nextDouble();
		double height = sc.nextDouble();
		double Area_cm2= (base*height)/2;
		double Area_in2= Area_cm2/0.625;
		System.out.printf("The Area of the triangle in sq cm is %.2f and in sq in is %.2f%n", Area_cm2, Area_in2);
	}

}
