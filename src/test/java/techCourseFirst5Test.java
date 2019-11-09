import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class techCourseFirst5Test {
    @Test
    public void answer() {
        techCourseFirst5 tc = new techCourseFirst5();
        String[] history = {"1.0", "2.0", "1.5"};
        int[] answer = {3000, 14000, 15000};
        String[] history2 = {"1.0", "2.0", "0.0", "1.0"};
        int[] answer2 = {-1};
        assertThat(tc.solution(history)).isEqualTo(answer);
        assertThat(tc.solution(history2)).isEqualTo(answer2);
    }

}