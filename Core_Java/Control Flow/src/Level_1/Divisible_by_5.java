package Level_1;
import java.util.*;

public class Divisible_by_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if (a % 5 == 0) {
            System.out.println("The number " + a + " is divisible by 5");
        } else {
            System.out.println("The number " + a + " is not divisible by 5");
        }

    }
}
