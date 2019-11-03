import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Test11Test {
    @Test
    public void answer() {
        Test11 test11 = new Test11();
        assertThat(test11.solution("Pyy")).isEqualTo(false);
    }

}