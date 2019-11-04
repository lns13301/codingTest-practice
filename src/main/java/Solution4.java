public class Solution4 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] state = new int[n];
        int answer = 0;

        for(int i = 0; i < n; i++) {
            state[i] = 1;
        }
        System.out.println("state = {" + state[0] + ", " + state[1] + ", " + state[2] + ", " + state[3] + ", " + state[4] + "}");
        for(int i = 0; i < lost.length; i++) {
            state[lost[i] - 1]--;
        }
        System.out.println("lost state = {" + state[0] + ", " + state[1] + ", " + state[2] + ", " + state[3] + ", " + state[4] + "}");
        for(int i = 0; i < reserve.length; i++) {
            state[reserve[i] - 1]++;
        }
        System.out.println("reserve state = {" + state[0] + ", " + state[1] + ", " + state[2] + ", " + state[3] + ", " + state[4] + "}");
        for(int i = 0; i < n; i++) {
            if(state[i] == 2) {
                if(i > 0 && state[i - 1] == 0) {
                    state[i]--;
                    state[i - 1]++;
                }
                else if(i < n - 1 && state[i + 1] == 0) {
                    state[i]--;
                    state[i + 1]++;
                }
            }
        }
        System.out.println("result state = {" + state[0] + ", " + state[1] + ", " + state[2] + ", " + state[3] + ", " + state[4] + "}");
        for(int i = 0; i < n; i++) {
            if(state[i] > 0)
                answer++;
        }

        return answer;
    }
}
