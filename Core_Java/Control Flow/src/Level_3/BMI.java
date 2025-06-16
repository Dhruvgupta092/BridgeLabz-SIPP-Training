package Level_3;
import java.util.*;
public class BMI {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		double BMI = weight/(height*height);
		if(BMI <= 18.4) {
			System.out.println("Underweight");
		}
		else if(BMI>=18.5 && BMI <=24.9) {
			System.out.println("Normal");
		}
		else if(BMI >=25.0 && BMI <=39.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}

	}

}
