public class techCourseFirst5 {
    public int[] solution(String[] history) {
        int[] recipe = {2, 25, 5, 5, 2};
        int[] ref = {5, 100, 10, 5, 2};
        int[][] buy = {{10, 10000}, {100, 3000}, {30, 1000}, {50, 2000}, {10, 1000}};
        int[] answer = new int[history.length];
        int price = 0;
        int[] need = new int[5];
        double[] historyD = new double[history.length];

        for(int i = 0; i < history.length; i++) {
            historyD[i] = Double.parseDouble(history[i]);
        }

        for(int i = 0; i < historyD.length; i++) {
            if(!(historyD[i] < 2.5 && historyD[i] >= 1.0)) {
                return new int[]{-1};
            }
            for(int j = 0; j < recipe.length; j++) {
                need[j] = (int)Math.round(recipe[j] * historyD[i]);

                if( j == 4 && (int)Math.round(historyD[i] % 0.5) % 2 == 1) {
                    need[j] /= 2;
                }
                ref[j] -= 2 * need[j];
                while (ref[j] < 0) {
                    ref[j] += buy[j][0];
                    price += buy[j][1];
                }
            }
            answer[i] += price;
            price = 0;
        }
        return answer;
    }
}