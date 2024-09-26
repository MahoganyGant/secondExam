package question_one;
import java.util.Scanner;

public class EvenOrOdd {
    //question one method
    public static void OddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    //question two method
    public static double CalculateArea(double a, double b, double h) {
        return ((a + b) / 2) * h;
    }

    //question three method
    public static void OddSquareRoot(int[] someNumbers) {

        for (int i = 0; i < someNumbers.length; i++) {
            if (someNumbers[i] % 2 != 0) { //dropped original if statement into a for loop to consolidate steps
                System.out.println(Math.sqrt(someNumbers[i]));
            }
        }
    }

    //question four method
    public class ScannerQuestion {
        public static void AreWeThereYet() {
            Scanner myObj = new Scanner(System.in);
            String ThereYet;

            do{
                System.out.println("Are we there yet?");
                ThereYet = myObj.nextLine();

            }while(!ThereYet.equalsIgnoreCase("yes"));
            System.out.println("Yes,we are there!");
        }
        //question five


        public static void main(String[] args) {
            OddOrEven(4);

            System.out.println(CalculateArea(6, 8, 7));

            int[] listNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            OddSquareRoot(listNumbers);

            AreWeThereYet();
        }
    }
}
