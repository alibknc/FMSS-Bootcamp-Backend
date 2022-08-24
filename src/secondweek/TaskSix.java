package secondweek;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        int num = getYear();
        boolean result = NumberUtil.isLeapYear(num);

        showResult(num, result);
    }

    public static int getYear(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir yıl giriniz: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void showResult(int year, boolean result){
        if(result)
            System.out.printf("%d artık yıldır", year);
        else
            System.out.printf("%d artık yıl değildir", year);
    }
}
