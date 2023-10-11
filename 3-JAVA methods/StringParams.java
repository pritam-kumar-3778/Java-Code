public class StringParams {
    public static void main(String[] args) {

        String myName = myBio("Pritam");
        System.out.println(myName);
        
    }
    static String myBio(String name){
        String msg = "Hello " + name;
        return msg;
    }
}
