import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class techCourseFirst7 {
    public String[] solution(String user, String[][] friends, String[] visitors) {
        List<String> human = new LinkedList<>();
        List<String> temp = new LinkedList<>();
        List<String> remover = new LinkedList<>();
        Map<String, Integer> hMap = new HashMap<>();
        String[] answer = {};
        for(int i = 0; i < friends.length; i++) {
            temp.add(friends[i][0]);
            temp.add(friends[i][1]);
        }

        for(int i = 0; i < temp.size(); i++) {
            if(!human.contains(temp.get(i))) {
                human.add(temp.get(i));
            }
        }

        for(int i = 0; i < friends.length; i++) {
            if(friends[i][0].equals(user)) {
                remover.add(friends[i][1]);
            }
            else if(friends[i][1].equals(user)) {
                remover.add(friends[i][0]);
            }
        }

        for(int i = 0; i < temp.size(); i++) {
            if(human.contains(remover.get(i))) {
                human.remove(remover.get(i));
            }
        }

        for(int i = 0; i < friends.length; i++) {
            for(int j = 0; j < remover.size(); j++) {
                if(friends[i][0].equals(remover.get(j))) {
                    hMap.put(friends[i][1], 10);
                }
                if(friends[i][1].equals(remover.get(j))) {
                    hMap.put(friends[i][0], 10);
                }
            }
        }

        for(int i = 0; i < human.size(); i++) {
            hMap.put(human.get(i), 0);
        }

        for(int i = 0; i < visitors.length; i++) {
            for (String s : hMap.keySet()) {
                if(visitors[i] == s) {

                }
            }

        }

        return answer;
    }
}
