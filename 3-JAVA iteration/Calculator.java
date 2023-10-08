import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.println("Enter first operand ::");
        int num1 = sc.nextInt();
        System.out.println("Enter second operand ::");
        int num2 = sc.nextInt();

        while(true){
        System.out.println("Enter an operator ::");
        char op = sc.next().trim().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){

            if(op == '+'){
                ans = num1 + num2;
            }

            else if(op == '-'){
                ans = num1 - num2;
            }

            else if(op == '*'){
                ans = num1 * num2;
            }

            else if(op == '/'){
                if(num2 != 0){
                    ans = num1 / num2;
                }
            }

            else if(op == '%'){
                ans = num1 % num2;
            }
        }
        else if(op == 'X' || op == 'x'){
            break;
        } else {
            System.out.println("Invalid operator");
        }
        System.out.println(" The " + op + " of " + num1 + " and " + num2 + " is : " + ans);    
    }
}
}
