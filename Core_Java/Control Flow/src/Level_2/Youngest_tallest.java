package Level_2;
import java.util.*;
public class Youngest_tallest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age of Amar: ");
		int Amar_age=sc.nextInt();
		System.out.println("Enter the age of Akbhar: ");
		int Akhbar_age=sc.nextInt();
		System.out.println("Enter the age of Anthony: ");
		int Anthony_age=sc.nextInt();
		System.out.println("Enter the height of Amar: ");
		int Amar_height=sc.nextInt();
		System.out.println("Enter the height of Akbhar: ");
		int Akhbar_height=sc.nextInt();
		System.out.println("Enter the height of Anthony: ");
		int Anthony_height=sc.nextInt();
		
		//find youngest
		
		String youngest = "";
        int minAge =Amar_age;
        youngest = "Amar";
        if (Akhbar_age < minAge) {
            minAge = Akhbar_age;
            youngest = "Akbar";
        }
        if (Anthony_age < minAge) {
            minAge = Anthony_age;
            youngest = "Anthony";
        }
        
        //find tallest
        String tallest="";
        int maxHeight= Amar_height;
        tallest = "Amar";
        if(Akhbar_height > maxHeight) {
        	maxHeight= Akhbar_height;
        	tallest ="Akhbar";
        }
        if (Anthony_height> maxHeight) {
        	maxHeight=Anthony_height;
        	tallest="Anthony";
        }
        
        System.out.println("The youngest friend is: " + youngest + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight );
        
		
		

	}

}
