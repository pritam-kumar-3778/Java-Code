class Intro{
    public static void main(String[] args) {
        int target = 6;
        int[] arr={3,5,6,4,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println(target +" is exist in the array");
            } 
        }
            
        }
    }

    /*
     * Best Case Time complexity(Constant) : O(1) : If element found in verry fast in the array (0th index).
     * Average Case Time Complexity : O(n)
     * Worst case Tie complexity : O(n) : n = size of the array, Iterate all the element and couldn't found thetarget element
     */

     /*
      * Space complexity : O(1) 
      May be the array size is 100000 but the array is stored in an varieable.
      */
