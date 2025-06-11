import java.util.Scanner;

public class PowerCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the base: ");
        double base = input.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();


        double result = Math.pow(base, exponent);

        System.out.printf("%.2f raised to the power %.2f is: %.2f\n", base, exponent, result);

        input.close();
    }
}
