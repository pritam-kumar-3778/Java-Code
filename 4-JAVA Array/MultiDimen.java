import java.util.Arrays;
import java.util.Scanner;
public class MultiDimen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //  int[][] num = new int[3][3];
        // DEfine nos of columns is not mandatory

         /*
            1 2 3
            4 5 
            6 7 8 9
         */
        // int[][] num0 = {
        //     {1,2,3}, //0th index -> num0[0] But num0[0][1] it gives 2
        //     {4,5}, //1st index -> num0[1] But num0[1][1] it gives 5
        //     {6,7,8,9} //2nd index -> num0[2] But num0[2][0] it gives 6
        // };

        /* How length works in 2D array ? */ 
        // int[][] num1 = new int[3][4];
        // System.out.println(num1.length); //It returns 3 (Return no of rows)

        /* input */ 
        int[][] num = new int[3][3];
        for(int row=0; row<num.length;row++){
        //    For each column in every row
            for(int col=0; col< num[row].length; col++){
                num[row][col]= sc.nextInt();
            }
        }
        /* Output */
        // for(int row=0; row<num.length;row++){
        //    //For each column in every row
        //     for(int col=0; col<num[row].length; col++){
        //         System.out.println(num[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        /* Or */

        // for(int row=0; row<num.length;row++){
        //      System.out.println(Arrays.toString(num[row]));
        // }

        /* By enhance for loop (forEach) */
        
        for(int[] n : num){
            System.out.println(Arrays.toString(n));
        }
/*
 * Outer loop iterating every row
 * and
 * Ineer loop iterating each column in row
 */
    
    }
}
