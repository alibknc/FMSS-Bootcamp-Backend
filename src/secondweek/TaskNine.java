package secondweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        List<Integer> date = getDate();
        int result = NumberUtil.getDayOfWeek(date);
        showResult(date, result);
    }

    public static List<Integer> getDate(){
        List<Integer> date = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir gün giriniz: ");
        date.add(Integer.parseInt(sc.nextLine()));

        System.out.print("Bir ay giriniz: ");
        date.add(Integer.parseInt(sc.nextLine()));

        System.out.print("Bir yıl giriniz: ");
        date.add(Integer.parseInt(sc.nextLine()));

        return date;
    }

    public static void showResult(List<Integer> date, int result){
        String day = switch (result) {
            case 0 -> "Pazar";
            case 1 -> "Pazartesi";
            case 2 -> "Salı";
            case 3 -> "Çarşamba";
            case 4 -> "Perşembe";
            case 5 -> "Cuma";
            case 6 -> "Cumartesi";
            default -> "";
        };

        System.out.printf("%d/%d/%d %s günüdür.", date.get(0), date.get(1), date.get(2), day);
    }
}
