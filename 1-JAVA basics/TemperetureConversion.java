import java.util.Scanner;
public class TemperetureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please tempereture in C::");
        // Convert tempereture in degree celcius to fahrenheit
        float tempC = sc.nextFloat();
        float result = (tempC * 9/5) +32;

        System.out.println(result + " fahrenheit");

    }
}
