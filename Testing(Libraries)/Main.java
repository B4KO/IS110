import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");

        String input = scanner.nextLine();
        System.out.println("The var was: " + input);
    }
}