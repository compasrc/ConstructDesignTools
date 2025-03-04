import java.util.*;

public class Main {
    public static String connectWords(List<String> epitopes) {
        return String.join("AAY", epitopes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> epitopes = new ArrayList<>();
        System.out.println("Enter words (type 'END' to stop):");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("END")) {
                break;
            }
            epitopes.add(line);
        }
        scanner.close();
        String result = connectWords(epitopes);
        System.out.println(result);
    }
}
