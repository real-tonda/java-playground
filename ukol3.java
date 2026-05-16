import java.util.Scanner;

public class ukol3 {
    public static int readGrade() {
        Scanner sc = new Scanner(System.in);
        int grade;
        while (true) {
            System.out.print("Enter grade (1-5): ");
            try {
                grade = sc.nextInt();
                break;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Invalid input; please enter an integer.");
                sc.next(); // consume invalid token
            }
        }
        return grade;
    }

    public static void main(String[] args) {
        int grade = readGrade();
        switch (grade) {
            case 1:
                System.out.println("Výborný");
                break;
            case 2:
                System.out.println("Chvalitebný");
                break;
            case 3:
                System.out.println("Dobrý");
                break;
            case 4:
                System.out.println("Dostatečný");
                break;
            case 5:
                System.out.println("Nedostatečný");
                break;
            default:
                System.out.println("Neplatná známka");
                break;
        }
    }
}