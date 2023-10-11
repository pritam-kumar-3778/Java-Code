// Print all the 3 digits amstrong number
public class AmstrongNo2 {
    public static void main(String[] args) {
        
        for(int i = 100; i <= 999; i++){
            if(isAmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
       return sum == original;
    }
}
