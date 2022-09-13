package secondweek;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        NumberUtil.getDigitsCount(getNumber());
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        return Integer.parseInt(sc.nextLine());
    }
}
