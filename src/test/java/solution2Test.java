import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class solution2Test {
    @Test
    public void created() {
        Solution2 solution2 = new Solution2();
        assertThat(solution2).isNotNull();
    }
    @Test
    public void output() {
        int[] answers1 = {1, 2, 3, 4, 5};
        int[] answers2 = {1, 3, 2, 4, 2};
        int[] result1 = {1};
        int[] result2 = {1, 2, 3};
        Solution2 solution2 = new Solution2();
        assertThat(solution2.solution(answers1)).isEqualTo(result1);
        assertThat(solution2.solution(answers2)).isEqualTo(result2);
    }
}