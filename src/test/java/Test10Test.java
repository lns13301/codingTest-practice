import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test10Test {
    @Test
    public void result() {
        Test10 test10 = new Test10();
        int[] answer = {1, 30};
        assertThat(test10.solution(3, 10)).isEqualTo(answer);
    }
}