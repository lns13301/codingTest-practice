import java.util.Arrays;

public class techCourseFirst3 {
    public int solution(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int answer = 0;
        int less;

        if(prices.length - discounts.length > 0)
            less = discounts.length;
        else
            less = prices.length;

        for(int i = 0; i < less; i++) {
            answer += Math.round(prices[prices.length - 1 - i] * (1 - discounts[discounts.length - 1 - i] * 0.01));
        }
        for(int i = less; i < prices.length; i++) {
            answer += prices[prices.length - 1 - i];
        }
        return answer;
    }
}
