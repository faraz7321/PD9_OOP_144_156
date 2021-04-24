import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String s = "Maybe a story will cheer you up: Once upon a time, there was an ugly barnacle. It was so ugly, that everyone died. The end.";
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        // String x = scanner.nextLine();
        System.out.println("Number of words: " + wordCounter(s));
        System.out.println("Number of vowels: " + vowelCounter(s));
        System.out.println("Number of punctuations: " + puncCounter(s));
        scanner.close();

    }

    public static int wordCounter(String s) {
        int count = 1;
        if (s == "") {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int vowelCounter(String s) {
        int count = 0;
        if (s == "") {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int puncCounter(String s) {
        int count = 0;
        if (s == "") {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '!' || c == '?' || c == ':' || c == ';' || c == '.' || c == ',' || c == ')' || c == '(' || c == '!'
                    || c == '\'' || c == '\"' || c == '-') {
                count++;
            }
        }
        return count;
    }

    public static boolean findSubString(String s, String sub) {
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {

        }
        return flag;
    }
}
