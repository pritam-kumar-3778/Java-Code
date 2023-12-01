/*
 * Order-Agnostic Binary Search : We know Array is sorted but don't know whether it is in ascending order or descending order.
 * arr = [2,4,6,8,10,12,14]
 * take : arr[0] = first and arr.length-1 = last
 * if(first < last) => Ascending order
 * if(first > last) => Descending order
 */

public class OrderAgnosticBC {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,26,41};
        int target = 26;
        int ans = orderAgnosticBC(arr, target);
        System.out.println("The element you found is at index :" + ans);
    }


    static int orderAgnosticBC(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // Find the array is sorted in ascending or descending order.
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }

        while(start <= end){
            // int mid = (start - end) / 2; It may exceed int value range
            int mid = start + (end - start) / 2;

            // if target element is same as mid element then this condition is true for both the cases.
            if(arr[mid] == target){
            return mid;
        }

        //Apply condition for ascending and descending
            if(isAsc){
                if(target < arr[mid]){
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
            } else { //case for descending order
                if(target > arr[mid]){
                end = mid - 1;
            } 
            else{
                start = mid + 1;
            }
            }  

        }
        return -1; //If target element not exist
    }
}
