import java.util.HashSet;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = isPangram(input.toLowerCase()); 

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean isPangram(String input) {
        if (input.length() < 26) {
            return false;
        }

        HashSet<Character> seenCharacters = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                seenCharacters.add(c);
            }
        }

        return seenCharacters.size() == 26;
    }
}
