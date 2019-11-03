import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test12Test {
    @Test
    public void answer() {
        Test12 test12 = new Test12();
        assertThat(test12.solution(626331)).isEqualTo(-1);
    }

}