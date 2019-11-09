import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class techCourseFirst6 {
    public String[] solution(String[][] forms) {
        String[][] split = new String[forms.length][3];
        List<Integer> overlap = new ArrayList<>();
        List<Integer> compare = new ArrayList<>();
        String[] answer;
        for(int i = 0; i < forms.length; i++) {
            split[i] = forms[i][1].split("");
        }
        for(int i = 0; i < split.length; i++) {
            for(int j = 1; j < split[i].length; j++) {
                for(int k = i + 1; k < split.length; k++) {
                    for(int m = 1; m < split[k].length; m++) {
                        if(split[i][j - 1].equals(split[k][m - 1])) {
                            if(split[i][j].equals(split[k][m])) {
                                overlap.add(i);
                                overlap.add(k);
                                break;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < overlap.size(); i++) {
            System.out.println(overlap.get(i));
        }
        for(int i = 0; i < overlap.size(); i++) {
            if(!compare.contains(overlap.get(i))) {
                compare.add(overlap.get(i));
            }
        }

        answer = new String[compare.size()];
        for(int i = 0; i < compare.size(); i++) {
            answer[i] = forms[compare.get(i)][0];
            System.out.println(answer[i]);
        }
        Arrays.sort(answer);

        return answer;
    }
}
