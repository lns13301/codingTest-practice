import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test5 {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> data = new LinkedList<>();
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) {
                data.add(arr[i]);
            }
        }
       if(data.isEmpty())
           data.add(-1);

        return data.stream().mapToInt(x -> x).toArray();
    }
}
