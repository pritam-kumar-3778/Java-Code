public class LoopScope {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) { // We can't use this i outside this for loop
            System.out.println(i);
        }
    }
}
