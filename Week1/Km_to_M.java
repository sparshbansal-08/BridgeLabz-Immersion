import java.util.Scanner;

public class Km_to_M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        


        
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        

        double miles = kilometers * 0.621371;

        System.out.printf("%.2f kilometers is equal to %.2f miles.\n", kilometers, miles);

        input.close();
    }
}
