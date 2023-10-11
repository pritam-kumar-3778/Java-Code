import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // ceate an array
        int arr[] = {1,2,3,4,5,6};

        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0] = 99;
    }
}

// Here the value of 0-th index is change.. because we modify the existing array.
// In String the value can't change...because we doesn't modify the string.
