import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a fruti among mango,apple and banana ::");
        String fruit = sc.next();

        switch(fruit){
            case "mango" :
            System.out.println("Someone is the sweetest mango of my life.");
            break;

            case "apple" :
            System.out.println("Millions saw the apple fall, but Newton was the one who asked why.");
            break;

            case "banana" :
            System.out.println("Life is full of banana skins. You slip, you carry on.");
            break;

            default :
            System.out.println("Please enter a fruti among mango,apple and banana.");
        }
    }
}
