import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class techCourse3Test {
    @Test
    public void answer() {
        techCourse3 tc = new techCourse3();
        assertThat(tc.solution("I love you")).isEqualTo("R olev blf");
    }

}