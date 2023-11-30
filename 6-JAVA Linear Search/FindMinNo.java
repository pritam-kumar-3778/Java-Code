public class FindMinNo {
    public static void main(String[] args) {
        int[] arr={3,5,2,4,8};
        System.out.println(minNO(arr));
    }
    
    // Assume array is not empty
    static int minNO(int[] arr){
        // Assume arr[0] is min no.
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
