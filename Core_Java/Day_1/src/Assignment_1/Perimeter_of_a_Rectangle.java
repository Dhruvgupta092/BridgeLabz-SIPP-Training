package Assignment_1;

import java.util.Scanner;

public class Perimeter_of_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length");
        double length = sc.nextDouble();;
        System.out.println("Enter the width");
        double width = sc.nextDouble();;
        double perimeter = 2*(length+width);
        System.out.println("Perimeter is "+perimeter);
    }
}
