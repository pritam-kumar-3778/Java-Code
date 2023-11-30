public class ReturnIndex {
    public static void main(String[] args) {
        int[] nums={44,43,56,75,32};
        int target = 86;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // Search item in the array : If found return the index other wise -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        // Run a for loop
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == target){
                return index;
            }
        }
        // If element doesn't exist in the array.
        return -1;
    }
}
