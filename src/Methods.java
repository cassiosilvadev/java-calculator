import operations.Division;

import java.util.Scanner;

public class Methods {

    public static Division share() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number: ");
        double a = sc.nextDouble();
        System.out.println("Type a number 2: ");
        double b = sc.nextDouble();

        Division d = new Division(a, b);
        System.out.println(d.share());
        return d;
    }
}
