import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {
            3,2,5,1,7,5,10,4
        };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr){
        // run the steps n-1 time
        for (int i = 0; i < arr.length; i++) {
            // For each step max item will come at the last respective index
            for (int j = 1; j <= arr.length - i - 1; j++) {
                // Swap if the item is smaller then the previous item
                if(arr[j] < arr[j-1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}