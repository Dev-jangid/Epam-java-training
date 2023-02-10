import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        System.out.println("Hello, " + input);
    }
}
