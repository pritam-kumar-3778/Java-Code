public class Parameter {
    public static void main(String[] args) {
        
        // Pass the value of number when you are calling the method in main.
        System.out.println("Sum of two number is :: " + sum(5,7));
    }
    static int sum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
}
}
