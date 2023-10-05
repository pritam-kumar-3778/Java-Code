import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your salary ::");
        int salary = sc.nextInt();

        if(salary <10000){
            salary = salary + 2000;
        } else {
            salary = salary + 3000;
        }
        System.out.println("Your salary with bonous : " + salary);
    }
}
