import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class MavenExercises {
    public class StringManipulator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Check if the input is a number
            boolean isNumber = StringUtils.isNumeric(input);
            System.out.println("Is a number: " + isNumber);

            // Flip the case of the string
            String flippedCase = StringUtils.swapCase(input);
            System.out.println("Flipped case: " + flippedCase);

            // Reverse the string
            String reversed = StringUtils.reverse(input);
            System.out.println("Reversed: " + reversed);
        }
    }
}
