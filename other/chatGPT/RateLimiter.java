import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *  bir sistemde her 60 sn de toplam 3 istek kabul ediyorsa kabul edilen isteklerin zamanlarının bulunması
 */

public class RateLimiter {
    
    private static Queue<Integer> rateLimiter(List<Integer> rates, int rateLimit) {

        Queue<Integer> queue = new LinkedList<>();

        if (queue.isEmpty()) queue.add(rates.get(0));

        for (int i = 1; i < rates.size(); i++) {
            if (queue.peek() <= (rates.get(i) - 60)) {
                if (queue.size() >= rateLimit) {
                    queue.remove(); 
                    queue.add(rates.get(i));
                }
            }
            if (queue.peek() > (rates.get(i) - 60)) {
                if (queue.size() < rateLimit) queue.add(rates.get(i));
            }
        }

        return queue;
    }

    public static void main(String[] args) {

        int limit = 3;
        List<Integer> rates = new ArrayList<>();
        rates.add(1);
        rates.add(10);
        rates.add(20);
        rates.add(61);
        rates.add(62);
        rates.add(63);
        rates.add(71);

        System.out.println(rateLimiter(rates, limit));
    }
}

