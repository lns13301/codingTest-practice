import java.util.ArrayList;
import java.util.List;

public class Test13 {
    public int solution(int[] scoville, int K) {
        List<Integer> scovilles = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < scoville.length; i++) {
            scovilles.add(scoville[i]);
        }

        scovilles.sort((a, b) -> {
            if(a > b)
                return -1;
            else if(a == b)
                return 0;
            else
                return 1;
        });

        for(int i = 0; i < 1000; i++) {
            scovilles.sort((a, b) -> {
                if (a > b)
                    return -1;
                else if (a == b)
                    return 0;
                else
                    return 1;
            });
            System.out.println("size = " + scovilles.size() + ", minimum = " + scovilles.get(scovilles.size() - 1));
            if (scovilles.get(scovilles.size() - 1) >= K){
                System.out.println("When break = " + scovilles.get(scovilles.size() - 1));
            break;
            }
            else if(scovilles.size() < 3) {
                System.out.println("When break = " + scovilles.get(scovilles.size() - 1));
                count = -1;
                break;
            }
            scovilles.set(scovilles.size() - 2, scovilles.get(scovilles.size() - 1) + (scovilles.get(scovilles.size() - 2) * 2));
            scovilles.remove(scovilles.size() - 1);
            count++;
        }
        System.out.println("FINALLY :: size = "+ scovilles.size() + ", minimum = " + scovilles.get(scovilles.size() - 1));
        return count;
    }
}
