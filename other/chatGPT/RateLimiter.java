import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *  bir sistemde her 60 sn de toplam 3 istek kabul ediyorsa kabul edilen isteklerin zamanlarının bulunması
 */
public class RateLimiter {
    
    private static Queue<Integer> rateLimiter(List<Integer> rates, int rateLimit) {
        if (rates == null || rates.isEmpty() || rateLimit <= 0) {
            return new LinkedList<>();
        }

        Queue<Integer> acceptedRequests = new LinkedList<>();
        acceptedRequests.offer(rates.get(0));

        for (int i = 1; i < rates.size(); i++) {
            int currentTime = rates.get(i);
            
            // Zaman penceresi dışındaki eski istekleri kaldır
            while (!acceptedRequests.isEmpty() && acceptedRequests.peek() <= currentTime - 60) {
                acceptedRequests.poll();
            }
            
            // Rate limit dolmamışsa yeni isteği ekle
            if (acceptedRequests.size() < rateLimit) {
                acceptedRequests.offer(currentTime);
            }
        }

        return acceptedRequests;
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

        Queue<Integer> result = rateLimiter(rates, limit);
        System.out.println("Kabul edilen isteklerin zamanları: " + result);
    }
}

