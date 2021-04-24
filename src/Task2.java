import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence:");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        System.out.println("Your sentence printed vertically is:");
        System.out.println(displayVertical(data));
        scanner.close();
    }

    public static String displayVertical(String data) {
        data = data.replaceAll("\\s+", "");
        String vertical = "";
        for (int i = 0; i < data.length(); i++) {
            vertical += data.charAt(i) + "\n";
        }
        return vertical;
    }
}
