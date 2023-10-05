import java.util.Scanner;
public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to know weekday or weekend :: ");
        int day = sc.nextInt();

        switch(day){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            System.out.println("Working day");
            break;
            case 6 :
            case 7 :
            System.out.println("Week end");
            break;

            default : 
            System.out.println("please enter a valid day (1 - 7) :: ");
        }
    }
}
