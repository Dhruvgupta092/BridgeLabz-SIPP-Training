package Level_2;
import java.util.*;
public class Multiplication_of_a_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=6;i<=9;i++){
			int c= n*i;
			System.out.println(n+"*"+i+":" +c);
		}
	}

}
