package Assignment_1;

import java.util.Scanner;

public class Calculate_Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int average= (a+b+c)/3;
        System.out.println(average);
    }
}
