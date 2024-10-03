import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean lengthValid = false;
        boolean widthValid = false;


        //input
        System.out.println("Enter the length of the rectangle.");
        do {
            if (scan.hasNextDouble()) {
                length = scan.nextDouble();
                if (length > 0) {
                    lengthValid = true;
                    scan.nextLine();
                } else {
                    System.out.println("You have inputted an invalid value. Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("Please enter a valid length of your rectangle.");
                scan.nextLine();
            }
        } while (!lengthValid);
        System.out.println("Enter the width of your rectangle.");
        do {
            if (scan.hasNextDouble()) {
                width = scan.nextDouble();
                if (width > 0) {
                    widthValid = true;
                } else {
                    System.out.println("You have inputted an invalid value. Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("Please enter a valid width of your rectangle.");
                scan.nextLine();
            }
        } while (!widthValid);

        //process
        area = length * width;
        perimeter = (length * 2) + (width * 2);
        diagonal = sqrt(pow(length, 2) + pow(width, 2));

        System.out.printf("%5s %10.2f %5s %10.2f %5s %10.2f %5s %10.2f %5s %10.2f", "Side 1:", length, "\nSide 2:", width, "\nArea:", area, "\nPerimeter:", perimeter,"\nDiagonal:", diagonal);
    }
}