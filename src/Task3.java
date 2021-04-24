import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Part 1
        System.out.println("Input String:");
        String s = scanner.nextLine();
        System.out.println("\n" + ridMultipleBlank(s));

        // Part 2
        System.out.println("Input String:");
        String input = "He is78 a go23od Prog97ram08er!";
        s = scanner.nextLine();
        System.out.println("\n" + removeInteger(s));

        // Part 3
        System.out.println("Input String:");
        s = scanner.nextLine();
        System.out.println("\n" + stringEncryption(s));
        scanner.close();

    }

    public static String ridMultipleBlank(String s) {
        s = s.replaceAll("\\s+", " ");
        return s;
    }

    public static String removeInteger(String s) {
        s = s.replaceAll("[0-9]", "");
        return s;
    }

    public static String stringEncryption(String s) {
        return s;
    }

}
