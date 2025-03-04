import java.util.*;

public class Main {
    public static String connectWords(List<String> epitopes) {
        return String.join("AAY", epitopes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> epitopes = new ArrayList<>();
        System.out.println("Enter epitopes separated by new lines:");
        while (true) {
            String line = scanner.nextLine().replaceAll("\\p{Zs}+", "").trim();
            if (line.isEmpty()) { // Stop when an empty line is entered
                break;
            }
            epitopes.add(line.replaceAll("\\s+", "")); // Remove all spaces within the line
        }
        scanner.close();
        String result = connectWords(epitopes);
        System.out.println(result);
    }
}
