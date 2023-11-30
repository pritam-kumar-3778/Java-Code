public class SearchInRange {
    public static void main(String[] args) {
        /*
         * [2,4,3,5,7,6,8]
         * Search 5 in the range between index 1 to 4
         */
            int[] arr = {2,4,3,5,7,6,8};
            int target = 5;
            for (int i = 1; i < arr.length; i++) {
                if(target == arr[i]){
                    System.out.println("Found the element " + target + " in the range.");
                }
            }
    }
}
