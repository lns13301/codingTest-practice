import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution3Test {
    @Test
    public void created() {
        Solution3 solution3 = new Solution3();
        assertThat(solution3).isNotNull();
    }
    @Test
    public void output() {
        Solution3 solution3 = new Solution3();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String[] participant2 = {"leo", "kiki", "eden", "kiki"};
        String[] completion2 = {"eden", "kiki", "leo"};
        assertThat(solution3.solution(participant, completion)).isEqualTo("leo");
        assertThat(solution3.solution(participant2, completion2)).isEqualTo("kiki");
    }
}