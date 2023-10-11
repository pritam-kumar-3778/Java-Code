import java.util.Scanner;
public class Return {
    public static void main(String[] args) {
        
        int ans = sum();
        System.out.println("Sum of two number is ::" + ans);

    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number :: ");
       int num1 = sc.nextInt();
       System.out.println("Enter second number :: ");
       int num2 = sc.nextInt();
       int sum = num1 + num2;
       return sum;

       // After doing the main work of the method it doesn't do any task, means after writing return statement the method is over.
        // System.out.println("OVER"); : It gives error.
   }
}
