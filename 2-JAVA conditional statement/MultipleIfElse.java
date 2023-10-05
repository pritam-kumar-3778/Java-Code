import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name ::");
        String name = sc.next();
        System.out.println("Please enter your age ::");
        int age = sc.nextInt();

        if(age < 13){
            System.out.println(name + ", You are now a child.");
        } 
        else if(age > 13 && age < 18){
            System.out.println(name + ", You are now a tean ager.");
        }
        else if(age >= 18){
            System.out.println(name + ", You are now an adult.");
        }
        else{
            System.out.println("Something went wrong...Please run again.");
        }  
    }
}
