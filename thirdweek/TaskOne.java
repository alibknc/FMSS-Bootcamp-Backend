package thirdweek;

import java.util.Locale;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        String text = getText();

        boolean resultTR = isPangramTR(text.toLowerCase(Locale.ROOT));
        boolean resultEN = isPangramEN(text.toLowerCase(Locale.ENGLISH));

        showResult(text, resultTR, resultEN);
    }

    public static String getText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");

        return sc.nextLine();
    }

    public static boolean isPangramTR(String text) {
        char[] alphabet = {'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z'};

        for (char character : alphabet) {
            if(text.indexOf(character) == -1)
                return false;
        }
        return true;
    }

    public static boolean isPangramEN(String text) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char character : alphabet) {
            if(text.indexOf(character) == -1)
                return false;
        }
        return true;
    }

    public static void showResult(String text, boolean resultTR, boolean resultEN){
        if(resultTR)
            System.out.printf("%s, Türkçe pangramdır%n", text);
        else
            System.out.printf("%s, Türkçe pangram değildir%n", text);

        if(resultEN)
            System.out.printf("%s, is an English pangram%n", text);
        else
            System.out.printf("%s, is not English pangram%n", text);
    }
}
