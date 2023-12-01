class Intro{
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,26,41};
        int target = 16;
        int start = arr[0];
        int end = arr.length;
        int midElement = (start + end) / 2;
        System.out.println("middle of array is : " + midElement);
        System.out.println("Element found at the index : " + binarySearch(arr, target, start, end, midElement));
        
    }
    static int binarySearch(int[] arr, int target, int start, int end, int midElement){
        if(midElement == target){
            return midElement;
        }

        if(midElement > target){
            end = midElement - 1;
            end --;
            for (end = 0; end < midElement; end--) {
                if(arr[end] == target){
                    return end;
                }
            }
        }

        if(midElement < target){
            start = midElement +1;
            start ++;
        for (start = 0; start < arr.length; start++) {
            if(arr[start] == target){
                return start;
            }
        }
        }
        return -1;
    }
}