import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator:");
        System.out.println("");
        System.out.println("Select an option by number.");
        System.out.println("0. - Division");
        System.out.println("");

        int option = sc.nextInt();

        switch (option) {

            case 0:
                Methods.share();
               break;

            default:
                System.out.println("This option was not found.");
        }
    }
}
