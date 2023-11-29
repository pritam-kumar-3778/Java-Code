import java.util.Arrays;

public class Swappig {
    public static void main(String[] args) {
        int[] arr = {3,34,5,6,56};
        swap(arr, 1,3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index3){
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }
}
