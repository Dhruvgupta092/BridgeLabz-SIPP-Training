package Level_2;
import java.util.*;
public class Maximum_number_of_HandShakes {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int Max_Handshakes=(n*(n-1))/2;
		System.out.println(Max_Handshakes);

	}

}
