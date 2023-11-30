public class SearchingInRange2 {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,7,6,8};
        int target = 5;
        // Search range between  1 to 4
        int ans = search(arr, target, 1, 4);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index <= end; index++){
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}