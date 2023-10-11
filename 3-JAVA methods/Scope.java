public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        // We cant use the varieable num1 and num2 here

        // call the function\
        number();
    }
    static void number(){
        int num1 = 30;
        int num2 = 50;
        System.out.println(num1);
        System.out.println(num2);

        // We cant use the varieable a and b here
    }
}
