public class techCourse1 {
    public int[] solution(int m) {
        int money = m;
        int[] answer = new int[9];
        int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for(int i = 0; i < answer.length; i++) {
            answer[i] = money / moneys[i];
            money %= moneys[i];
        }

        return answer;
    }
}