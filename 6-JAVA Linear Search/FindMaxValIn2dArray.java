public class FindMaxValIn2dArray {
    public static void main(String[] args) {
        int[][] arr={
            {2,4,6},
            {8,10,12},
            {14,66,18},
            {24,26,28,44}
        };
        int ans= search(arr);
        System.out.println(ans);
    }
        static int search(int[][] arr){
            int max = arr[0][0];      //Integer.MIN_VALUE;
            for (int row = 0; row < arr.length; row++) {
                for (int column = 0; column < arr[row].length; column++) {
                    if(arr[row][column] > max){
                        max = arr[row][column];
                    }
                    }
                }
        
            return max;
        }
    }


