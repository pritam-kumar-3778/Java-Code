// Take input of 2 numbers and print the sum

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        // call the sum function
        sum();

    }
    static void sum(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two number is ::" + sum);

        // After doing the main work of the method it also do many task we given.
        System.out.println("OVER"); 

    }
}