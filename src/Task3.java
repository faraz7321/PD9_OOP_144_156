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
        // String input = "He is78 a go23od Prog97ram08er!";
        s = scanner.nextLine();
        System.out.println("\n" + removeInteger(s));

        // Part 3
        System.out.println("Input String:");
        s = scanner.nextLine();
        // s = "Programs must be written for people to read, and only incidentally for
        // machines to execute";
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
        char[] arr = s.toCharArray();
        int x = 8;
        int count = 0;
        String encrypt = "";
        int c;
        encrypt += arr[0] - (char) x;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                c = arr[i + 1] - x - count;
                encrypt += (char) c;
                count++;
            }
        }
        return encrypt.toUpperCase();
    }

}
