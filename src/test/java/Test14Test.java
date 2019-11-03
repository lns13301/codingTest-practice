import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class Test14Test {
    @Test
    public void answer() {
        Test14 test14 = new Test14();
        assertThat(test14.solution(2,4,2,1)).isEqualTo("0111");
        assertThat(test14.solution(16,16,2,1)).isEqualTo("02468ACE11111111");
        assertThat(test14.solution(16,16,2,2)).isEqualTo("13579BDF01234567");
        assertThat(test14.solution(10,9,3,2)).isEqualTo("147111417");
        assertThat(test14.solution(2,12,4,3)).isEqualTo("110011111111");
    }

}