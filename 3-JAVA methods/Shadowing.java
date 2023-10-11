public class Shadowing {
    static int x = 10; // This will be shadow in line 6.
    public static void main(String[] args) {
        System.out.println(x); // 10
        
        int x =30; // The class varieable of line 4 is shadowed by this.
        System.out.println(x); // 30
        
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
