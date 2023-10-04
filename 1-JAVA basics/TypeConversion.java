import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
}

// Suppodse input = 6
// Then result is 6.0

// type conversion possible when DESTINITION SIZE > SOURCE SIZE
// BYTE converted to SHORT
// SHORT converted to INT
// INT converted to FLOAT
// FLOAT converted to LONG
// LONG converted to DOUBLE
