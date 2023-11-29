public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,8};
        System.out.println(max(arr));

    }

    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
             if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
       return maxVal;
    }
}
