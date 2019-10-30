import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution1Test {
    @Test
    public void created(){
        Solution1 solution1 = new Solution1();
        assertThat(solution1).isNotNull();
    }
    @Test
    public void output(){
        int[] result1 = {5, 6, 3};
        int[] result2 = {3, 2, 2};
        Solution1 solution1 = new Solution1();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        assertThat(solution1.solution(array, commands)).isEqualTo(result1);
        int[] array2 = {2, 3, 4, 2, 1, 2, 3, 2, 1};
        int[][] commands2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        assertThat(solution1.solution(array2, commands2)).isEqualTo(result2);
    }
}