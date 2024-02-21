import java.util.Scanner;
import java.util.ArrayList;

public class Emirp_Numbers {
    public ArrayList<Integer> emirp(String number) {
        ArrayList<Integer> emirp_list = new ArrayList<Integer>();
        int count = 0, num;
        num = Integer.parseInt(number);
        for (int i = 2; i <= num; i++) {
            if (isPrime(i) && isPrime(reverseNumber(i)) && i != reverseNumber(i)) {
                emirp_list.add(i);
            }
        }
        //System.out.println(emirp_list);
        return emirp_list;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
}
