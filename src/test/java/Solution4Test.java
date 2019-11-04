import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class Solution4Test {
    @Test
    public void answer() {
        Solution4 solution4 = new Solution4();
        int[] lost1 = {2,4};
        int[] reserve1 = {1,3,5};
        int[] lost2 = {2,4};
        int[] reserve2 = {3};
        assertThat(solution4.solution(5, lost1, reserve1)).isEqualTo(5);
        assertThat(solution4.solution(5, lost2, reserve2)).isEqualTo(4);
    }
}