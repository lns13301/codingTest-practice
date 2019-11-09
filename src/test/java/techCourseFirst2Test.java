import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class techCourseFirst2Test {
    @Test
    public void answer() {
        techCourseFirst2 tc = new techCourseFirst2();
        int[] answer = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 1, 1, 0, 1, 0, 4, 0, 1, 1, 0, 0, 0};
        assertThat(tc.solution("2019/05/01 00:59:192019/06/01 01:35:202019/08/01 02:01:222019/08/01 02:01:232019/08/02 03:02:352019/10/03 04:05:402019/10/04 06:23:102019/10/01 08:23:202019/10/01 08:42:242019/10/01 08:43:262019/11/01 08:43:292019/11/01 10:19:022019/12/01 11:23:10")).isEqualTo(answer);
    }

}