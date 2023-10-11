// Check amstrong number.
import java.util.Scanner;
public class AmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check amstrong :: ");
        int n = sc.nextInt();

        System.out.println(isAmstrong(n));
    }
    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
       return sum == original;
    }
}
