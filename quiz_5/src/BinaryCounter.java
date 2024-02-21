import java.util.LinkedList;
import java.util.Queue;

public class BinaryCounter {

    public static String countBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        String returnedString = "";
        for (int i = 1; i <= n; i++) {
            String binaryNumber = queue.poll();
            returnedString = returnedString + binaryNumber + "\t";

            queue.offer(binaryNumber + "0");
            queue.offer(binaryNumber + "1");
        }
        return returnedString;
    }
}