import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, List<Boolean>> hMap = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            if(hMap.get(participant[i]) == null){
                List<Boolean> arrived = new ArrayList<>();
                arrived.add(false);
                hMap.put(participant[i], arrived);
            }
            else {
                hMap.get(participant[i]).add(false);
            }
        }

        for (int i = 0; i < participant.length - 1; i++)
                hMap.get(completion[i]).set(hMap.get(completion[i]).indexOf(false),true);

        return hMap.keySet().stream().filter(x-> hMap.get(x).contains(false)).collect(Collectors.joining());
    }
}
