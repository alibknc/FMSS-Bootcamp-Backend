package secondweek;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        int num = getNumber();
        int result = NumberUtil.factorial(num);

        showResult(num, result);
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void showResult(int num, int result){
        System.out.printf("%d sayısının faktöriyeli: %d", num, result);
    }
}
