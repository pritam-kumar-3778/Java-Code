public class ImprovedOfIntro {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,26,41};
        int target = 26;
        int ans = binarySearch(arr, target);
        System.out.println("The element you found is at index :" + ans);
        
    }
    static int binarySearch(int[] arr, int target){
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
        return -1; //If target element not exist
    }
}
