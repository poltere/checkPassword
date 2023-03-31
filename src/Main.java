// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Введите пароль:");

        boolean engChar = false;
        boolean rusChar = false;
        boolean digitCheck = false;

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.UnicodeBlock.of(ch).equals(Character.UnicodeBlock.CYRILLIC)) {
                rusChar = true;
            } else if (Character.UnicodeBlock.of(ch).equals(Character.UnicodeBlock.BASIC_LATIN)) {
                engChar = true;
            }
            if (Character.isDigit(ch)) {
                digitCheck = true;
            }
        }
        if (input.length() < 8) {
            System.out.println("Короткий пароль");
            return;
        }
        if (rusChar && engChar && digitCheck) {
            System.out.println("Хороший пароль");
        } else {
            System.out.println("Слабый пароль");
        }
    }
}