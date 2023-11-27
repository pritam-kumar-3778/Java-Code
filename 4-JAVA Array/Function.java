import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        String[] name = {"Anurag", "Subhecchha", "Sumi", "Khushi", "Puja"};
        System.out.println(Arrays.toString(name));
        System.out.println("Change the name Anurag to pritam");
        modify(name);
        System.out.println(Arrays.toString(name));

    }
    static void modify(String[] Aname){
        Aname[0] = "Pritam";
    }
}

// Arrays are mutable (can change) in java