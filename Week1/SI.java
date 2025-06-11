import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time in years: ");
        double time = input.nextDouble();


        double simpleInterest = (principal * rate * time) / 100;


        System.out.printf("The Simple Interest is: %.2f\n", simpleInterest);

        input.close();
    }
}
