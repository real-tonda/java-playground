import java.util.Scanner;

public class ukol2{
    // read age from user with validation (mirrors ukol3 style)
    public static int readAge() {
        Scanner sc = new Scanner(System.in);
        int age;
        while (true) {
            System.out.print("Please enter your age: ");
            try {
                age = sc.nextInt();
                break;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Invalid input; please enter an integer.");
                sc.next(); // consume invalid token
            }
        }
        return age;
    }

    public static void main(String[] args){
        int num = readAge();
        if (num < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }
        System.out.println("You entered: " + num);
    }
}