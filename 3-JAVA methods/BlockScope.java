public class BlockScope {
    public static void main(String[] args) {
        int a = 34;
        String name = "Pritam";
        // create a block
        {
            a = 56;
            name = "Pritam Kumar Patel";  //we can change the value but cant initilize again in the same method.
            int c = 86;
            System.out.println(c);

            // The value that are initilize in the block is remein in the same block.
        }
        System.out.println(a);  // 56 because reassign the original reff varieable to some other value in the same method.
        System.out.println(name);  // Pritam Kumar Patel
    }
}
