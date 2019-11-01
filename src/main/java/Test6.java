import java.util.stream.Stream;

public class Test6 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i < arr.length; i++){
            answer += (double) arr[i];
        }
        return answer / (double) arr.length;
    }
}
