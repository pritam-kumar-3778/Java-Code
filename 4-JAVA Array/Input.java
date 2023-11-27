import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        arr[0] = 23;
        arr[1] = 32;
        arr[2] = 54;
        arr[3] = 56;
        arr[4] = 76;
        // Internally : [23,32,54,56,76]
        System.out.println(arr[4]); //It returns 76


        // Input using for loop
        int rollNos[] = new int[10];
        System.out.println("Enter rollNos of 10 Students :");
        for(int i=0; i<rollNos.length; i++){
            rollNos[i] = sc.nextInt();
        }

        // for(int i=0; i<rollNos.length; i++){
        //     System.out.println(rollNos[i]+ " ");
        // }
        
        // By replacing above 3 lines code using forEach
        for(int rolls : rollNos){
            System.out.println(rolls);
        }

        // By using toString method we also print
        // System.out.println(Arrays.toString(rollNos));


        // String array
        String[] name = new String[4];
        System.out.println("Enter names:");
        for(int i=0; i<name.length;i++){
            name[i] = sc.next();
        }

        // Modify the original object
        name[0] = "Pritam";
        System.out.println(Arrays.toString(name));
    }
}
