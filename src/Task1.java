import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("This string contains " + wordCounter(s) + " words");
        System.out.println("This string contains " + vowelCounter(s) + " vowels");
        scanner.close();

    }

    public static int wordCounter(String s) {
        int count = 1;
        if (s == "") {
            return 0;
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
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
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
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
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}
