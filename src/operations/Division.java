package operations;

public class Division {

    private double x;
    private double y;

    public Division(double a, double b) {
        x = a;
        y = b;
    }

    public double share() {
        double result = x / y;
        return result;
    }
}
