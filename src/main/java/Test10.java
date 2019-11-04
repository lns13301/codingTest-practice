import java.util.LinkedList;
import java.util.List;

public class Test10 {
    public int[] solution(int n, int m) {
        List<Integer> number1 = new LinkedList<>();
        List<Integer> number2 = new LinkedList<>();
        List<Integer> factor = new LinkedList<>();
        List<Integer> divisor = new LinkedList<>();
        int divisorValue = 1;
        int[] answer = new int[2];

        for(int i = 1; i < n + 1; i++) {
            if(n % i == 0) {
                number1.add(i);
            }
        }
        for(int i = 1; i < m + 1; i++) {
            if(m % i == 0) {
                number2.add(i);
            }
        }
        for(int i = 0; i < number1.size(); i++) {
            for(int j = 0; j <number2.size(); j++) {
                if(number1.get(i).equals(number2.get(j))) {
                    factor.add(number1.get(i));
                    divisor.add(number1.get(i));
                }
            }
        }

        for(int i = 0; i < divisor.size(); i++) {
            divisorValue = divisorValue * divisor.get(i);
        }
        System.out.println(divisorValue);
        divisorValue = divisorValue * (n / divisorValue) * (m / divisorValue);

        factor.sort((a, b) ->{
            if(a > b)
                return -1;
            else if(a.equals(b))
                return 0;
            else
                return 1;
        });
        answer[0] = factor.get(0);
        answer[1] = divisorValue;
        return answer;
    }
}

