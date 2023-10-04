import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age :");
        System.out.println(sc.nextInt()); //takes intiger value

        System.out.println("Enter your first name :");
        System.out.println(sc.next()); // takes only one word

        // System.out.println("Enter your full name :");
        // System.out.println(sc.nextLine()); // takes full String/Sentence

        System.out.println("Enter the value of PI :");
        System.out.println(sc.nextFloat()); // takes decimal number

        System.out.println("Enter a long decimal value :");
        System.out.println(sc.nextDouble()); //takes long decimal value

        System.out.println("Enter a long integer value :");
        System.out.println(sc.nextDouble()); //takes long integer value

    }
}
