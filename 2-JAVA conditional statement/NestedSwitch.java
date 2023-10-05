import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Emp ID :: ");
        int empId = sc.nextInt();

        System.out.println("Enter Dept. :: ");
        String dept = sc.next();

        switch(empId){
            case 1 : 
            System.out.println("Emp 1.");
            switch(dept){
                    case "frontend" :
                    System.out.println("Frontend Developer");
                    break;

                    case "backend" :
                    System.out.println("Backend Developer");
                    break;

                    case "fullstack" :
                    System.out.println("Full stack developer.");
                    break;

                    case "java" :
                    System.out.println("Java Developer.");
                    break;

                    default :
                    System.out.println("Others.");
                }
                break;

            case 2 : 
            System.out.println("Emp 2.");
            switch(dept){
                    case "frontend" :
                    System.out.println("Frontend Developer");
                    break;

                    case "backend" :
                    System.out.println("Backend Developer");
                    break;

                    case "fullstack" :
                    System.out.println("Full stack developer.");
                    break;

                    case "java" :
                    System.out.println("Java Developer.");
                    break;

                    default :
                    System.out.println("Others.");
                }
                break;

            case 3:
            System.out.println("Emp 3.");
                switch(dept){
                    case "frontend" :
                    System.out.println("Frontend Developer");
                    break;

                    case "backend" :
                    System.out.println("Backend Developer");
                    break;

                    case "fullstack" :
                    System.out.println("Full stack developer.");
                    break;

                    case "java" :
                    System.out.println("Java Developer.");
                    break;

                    default :
                    System.out.println("Others.");
                }
                break;
                default :
                System.out.println("Please enter valid emp ID.");
        }
    }
}
