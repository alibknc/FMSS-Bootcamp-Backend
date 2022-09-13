package secondweek;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("a^b işlemi için;");
        System.out.print("a sayısını giriniz: ");
        int a = getNumber();
        System.out.print("b sayısını giriniz: ");
        int b = getNumber();

        int result = NumberUtil.pow(a, b);
        showResult(a, b, result);
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public static void showResult(int a, int b, int result) {
        System.out.printf("%d sayısının %d. dereceden kuvveti: %d", a, b, result);
    }
}
