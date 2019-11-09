import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class techCourseFirst1Test {
    @Test
    public void solution() {
        techCourseFirst1 tc = new techCourseFirst1();
        int[] restaurant = {0, 0};
        int[][] riders = {{-700, 0}, {150, 180}, {500, 500}, {150, -800}, {800, 800}, {-900, 500}, {-1100, 900}};
        assertThat(tc.solution(restaurant, riders, 1000)).isEqualTo(4);
    }

}