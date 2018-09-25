
import java.util.Scanner;




public class ElizaApplication {
    public static void main(String[] args) {
        System.out.println("Hello! what is your problem? or enter Q to quit the program.");
        Scanner kb = new Scanner(System.in);
        String myAnswer = kb.nextLine();
        while (!myAnswer.equalsIgnoreCase("Q") ){
            System.out.println(myAnswer);
            System.out.println("What is your problem? or enter Q to quit the program.");
             kb = new Scanner(System.in);
         myAnswer = kb.nextLine();

            }





















    }
}
