public class ReturnElement {
    public static void main(String[] args) {
        int[] nums = { 33,44,43,77, 54, 59};
        int target = 77;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int element : arr) {
            if(element == target){
                return element;
            }
        }
        // If element not found in the array.
        return -1;
    }
}
