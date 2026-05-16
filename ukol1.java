import java.util.Scanner;

public class ukol1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Please enter your age: ");
            try {
                num = sc.nextInt();
                break;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Invalid input; please enter an integer.");
                sc.next();
            }
        }
        System.out.println("You entered: " + num);
    }
}