package Level_2;
import java.util.*;
public class Greatest_Factor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int Greatest_Factor=1;
		for(int i=n-1;i>=1;i--) {
			if(n % i ==0) {
				Greatest_Factor=i;
				break;
			}
		}
		System.out.println(Greatest_Factor);

	}

}
