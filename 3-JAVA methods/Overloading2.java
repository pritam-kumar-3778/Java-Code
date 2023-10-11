public class Overloading2 {
    public static void main(String[] args) {
        
        fun("Pritam", "Anurag");
        // fun(1,2,3,4,5);
        // fun() - It gives error.. It's called ambiguity.

    }
    static void fun(int ...n){
        System.out.println(n);
    }

    static void fun(String ...s){
        System.out.println(s);
    }
}
