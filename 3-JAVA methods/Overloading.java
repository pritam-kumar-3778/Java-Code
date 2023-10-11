public class Overloading {
    public static void main(String[] args) {
        
       fun(5);
       fun("Pritam");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}

// Same function name but different arguement
// It determinated as compile time
