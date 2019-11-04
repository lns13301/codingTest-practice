import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class Test13Test {
    @Test
    public void answer() {
        Test13  test13 = new Test13();
        int[] answer = {1, 5, 6, 2, 10, 7};
        int[] answer2 = {1, 2, 3, 9, 10, 12};
        int[] answer3 = {6,41,4,78,12,23,58,3,132,234,3,441,3,5,423,32,212};
        assertThat(test13.solution(answer, 7)).isEqualTo(3);
        assertThat(test13.solution(answer2, 7)).isEqualTo(2);
        assertThat(test13.solution(answer3, 400)).isEqualTo(13);
    }

}