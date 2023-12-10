public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        // If Don't find the pivot It means the array is not roated.
        if(pivot == -1){
            // Just do normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // If find the pivot, Find two ascending arrays also
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length-1);

    }

// Binary search
    static int binarySearch(int[] arr, int target, int start, int end){
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


// Find Pivot
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // find mid element

            // int mid = (start - end) / 2; It may exceed int value range
            int mid = start + (end - start) / 2;
            // There are 4 cases 
            // case 1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid; //found the ans
            }
            // case 2
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // case 3
            if(arr[mid] <= start){
                end = mid - 1;
            } else {  //start <= mid
                start = mid + 1;
            }
        }
        return -1;
    }
}
