public class FloorOfANo {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println("The element you found is at index :" + ans);
        
    }
    // Return the index of smallest no <= target
    static int floor(int[] arr, int target){

        // If the target is smaller then the smallest number in the array.
        if(target < arr[0]){
            return -1;
        }
        // If target is greater then the gretest number in the array.
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // int mid = (start - end) / 2; It may exceed int value range
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } 
            else if
            (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }

        }
        return end; //If target element not exist
    }
}
