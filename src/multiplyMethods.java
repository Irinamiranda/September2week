
import java.util.Scanner;

public class multiplyMethods {

    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = kb.nextInt();

        System.out.println("Enter your second number");
        int number2 = kb.nextInt();

        int sum = getSum(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);



    }

    static int getSum(int number1, int number2) {
        int sum = number1 + number2;

        return sum;
    }
}
