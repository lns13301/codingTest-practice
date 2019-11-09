public class techCourseFirst1 {
    public int solution(int[] restaurant, int[][] riders, int k) {
        int answer = 0;

        for(int i = 0; i < riders.length; i++) {
            riders[i][0] -= restaurant[0];
            riders[i][1] -= restaurant[1];
        }
        for(int i = 0; i < riders.length; i++)
            if (k > Math.sqrt(riders[i][0] * riders[i][0] + riders[i][1] * riders[i][1]))
                answer++;

        return answer;
    }
}
