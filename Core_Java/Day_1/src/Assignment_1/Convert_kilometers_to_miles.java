package Assignment_1;

import java.util.Scanner;

public class Convert_kilometers_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Kilometers = sc.nextInt();
        double miles=  Kilometers*0.621371;
        System.out.println("The miles is "+miles);
    }
}
