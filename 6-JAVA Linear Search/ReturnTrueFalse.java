public class ReturnTrueFalse {
    public static void main(String[] args) {
        int[] nums = {23, 54, 65, 43, 59};
        int target = 65;
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static boolean linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for (int element : arr) {
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
