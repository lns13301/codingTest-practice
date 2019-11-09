import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class techCourseFirst6Test {
    @Test
    public void solution() {
        String[][] forms = {{"jm@email.com", "제이엠"}, {"jason@email.com", "제이슨"}, {"woniee@email.com", "워니"}, {"mj@email.com", "엠제이"}, {"nowm@email.com", "이제엠"}};
        String[] result = {"jason@email.com", "jm@email.com", "mj@email.com"};
        techCourseFirst6 tc = new techCourseFirst6();
        assertThat(tc.solution(forms)).isEqualTo(result);
    }

}