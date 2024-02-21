import java.util.ArrayList;

public class Abundant_Numbers {
    public ArrayList<Integer> abundant(String n) {
        int k;
        k = Integer.parseInt(n);
        ArrayList<Integer> int_list = new ArrayList<Integer>();
        for(int num = 0; num <= k; num++) {
            if (isAbundant(num)) {
                int_list.add(num);
            }
        }
        //System.out.println(int_list);
        return int_list;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }
}