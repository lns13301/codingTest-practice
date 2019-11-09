public class techCourseFirst2 {
    public int[] solution(String logs) {
        String[] split = logs.split("");
        int time;
        int[] answer = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(int i = 0; i < split.length; i++) {
            if(i % 19 == 0) {
                time = (Integer.parseInt(split[i + 11]) * 10) + Integer.parseInt(split[i + 12]);
                if(time > 23)
                    time -= 24;
                answer[time + 9]++;
            }
        }

        return answer;
    }
}
