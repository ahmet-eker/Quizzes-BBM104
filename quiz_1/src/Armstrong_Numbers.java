import java.util.ArrayList;

public class Armstrong_Numbers {
    public ArrayList<Integer> armstrong(String numb) {
        int number = Integer.parseInt(numb);
        ArrayList<Integer> int_list = new ArrayList<Integer>();

        for (int num = 1; num <= number; num++) {
            int order = String.valueOf(num).length();
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, order);
                temp /= 10;
            }
            if (num == sum) {
                int_list.add(num);
            }
        }
        //System.out.println(int_list);

        return int_list;

    }
}