//Varieable length arguement
import java.util.*;
public class Varargs {
    public static void main(String[] args) {

        fun(1,2,3,4,5,6,7,8,9,10);

        // fun(); - This will return an empty array

        multipleArgs(2, 5, "Pritam", "Anurag");
        
    }
    static void fun(int ...n){  //Array of integers
        System.out.println(Arrays.toString(n));
    }

    static void multipleArgs(int a,int b, String ...s){
        
    }
}
