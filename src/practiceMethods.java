import java.util.Scanner;

public class practiceMethods {
    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = kb.nextInt();
        System.out.println("Your number is: " + number);
        int result = divideBy5(number);
        System.out.println("the " + number + " / 5 = " + result);






    }
    static int divideBy5(int number){

        int result = number / 5;
        return result;
    }

}
