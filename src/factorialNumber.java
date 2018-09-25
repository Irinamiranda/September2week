
import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = 0;
        //make a loop to ask user input the number for 3 times
        for (n = 0; n < 3; n++) {
        System.out.println("Enter your number");
        int number = kb.nextInt();
        //call getFactorial method to do calculations
        int factorial = getFactorial( number);
        System.out.println(factorial);}




        }
        static int getFactorial(int number) {

        int factorial = 1;
        for (int count = 1; count <= number; ++count){

            factorial *= count;



        }
            return factorial;





















    }
}
