import java.util.Arrays;

public class techCourse3 {
    public String solution(String word) {
        char[] array = word.toCharArray();
        String answer = "";

        for(int i = 0; i < array.length; i++) {
            if((int)array[i] > (int)'a' && (int)array[i] < (int)'z') {
                answer += (char)((int)'a' + (int)'z' - (int)array[i]);
            }
            else if((int)array[i] > (int)'A' && (int)array[i] < (int)'Z') {
                answer += (char)((int)'A' + (int)'Z' - (int)array[i]);
            }
            else {
                answer += array[i];
            }
        }
        return answer;
    }
}
