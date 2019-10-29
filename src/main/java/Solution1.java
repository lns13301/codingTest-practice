import java.util.Arrays;

public class Solution1 {
    public int[] solution(int[] array, int[][] commands) {
        String tempStr = "";
        String tempStr2;
        int size = 0;
        int[] tempSort;
        int[] answer = new int[commands.length];
        for(int i = 0; i < array.length; i++)
            tempStr += Integer.toString(array[i]);

        for(int i = 0; i < commands.length; i++) {
            tempStr2 = tempStr.substring(commands[i][0] - 1, commands[i][1]);
            tempSort = new int[commands[i][1] - commands[i][0] + 1];
            for(int j = 0; j < commands[i][1] - commands[i][0] + 1; j++) {
                tempSort[j] = Integer.parseInt(tempStr2.substring(j, j + 1));
            }
            Arrays.sort(tempSort);
            answer[size] = tempSort[commands[i][2] - 1];
            size++;
        }
        return answer;
    }
}
