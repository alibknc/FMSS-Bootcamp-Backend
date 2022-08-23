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
        System.out.printf("%d sayısının %d. dereceden kuvveti: %d", a, b, result);
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
