package learning.java;
import java.util.Scanner;

public class UserInput {
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть слово для пошуку: ");
        return scanner.nextLine();
    }
}
