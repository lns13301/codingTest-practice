import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class techCourse1Test {
    @Test
    public void answer() {
        techCourse1 tc = new techCourse1();
        int[] answer1 = {1, 0, 0, 0, 0, 2, 0, 3, 7};
        int[] answer2 = {0, 1, 1, 0, 0, 0, 0, 0, 0};
        int[] answer3 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] answer4 = {0, 0, 0, 0, 0, 0, 0, 0, 8};
        assertThat(tc.solution(50237)).isEqualTo(answer1);
        assertThat(tc.solution(15000)).isEqualTo(answer2);
        assertThat(tc.solution(0)).isEqualTo(answer3);
        assertThat(tc.solution(8)).isEqualTo(answer4);
    }
}