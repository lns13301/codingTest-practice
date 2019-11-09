import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class demoTestTest {
    @Test
    public void answer() {
        demoTest dt = new demoTest();
        int[][] one = {{1, 4}, {3, 4}, {3, 10}};
        int[] answer = new int[]{1, 10};
        int[][] two = {{2, 0}, {0, 2}, {0, 0}};
        int[] answer2 = new int[]{2, 2};
        assertThat(dt.solution(one)).isEqualTo(answer);
        assertThat(dt.solution(two)).isEqualTo(answer2);
    }

}