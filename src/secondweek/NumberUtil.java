package secondweek;

public class NumberUtil {
    public static void getDigitsCount(int num){
        int count = 0;
        int temp = num;

        if(num == 0){
            count = 1;
        }else{
            while(temp != 0){
                temp /= 10;
                count++;
            }
        }

        System.out.printf("%d sayısının basamak sayısı: %d", num, count);
    }

    public static void getReversed(int num){
        int reversed = 0;
        int temp = num;

        while (temp != 0){
            reversed = (reversed * 10) + (temp % 10);
            temp /= 10;
        }

        System.out.printf("%d sayısının tersi: %d", num, reversed);
    }

    public static int pow(int a, int b){
        int result = 1;

        if(b > 0){
            for (int i = 0; i < b; i++){
                result = result * a;
            }
        }

        return result;
    }

    public static boolean isArmstrong(int num){
        int result = 0;
        int temp = num;

        if(num < 0){
            return false;
        }

        while (temp != 0){
            result += pow(temp % 10, 3);
            temp /= 10;
        }

        return num == result;
    }
}
