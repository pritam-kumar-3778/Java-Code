public class Swap {
    public static void main(String[] args) {

        swapNo();
        
    }
    static void swapNo(){
        int a = 10;
        int b = 20;
        System.out.println("before swapping a = " + a + " and b = " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a = " + a + " and b = " + b);
    }
}
