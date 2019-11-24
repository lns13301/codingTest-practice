import java.util.Stack;

public class Iron {
    public int solution(String arrangement) {
        Stack<Character> stack = new Stack<>();
        char[] chars = arrangement.toCharArray();
        int count = 0;
        int countL = 0;
        int answer = 0;

        System.out.println(" ");
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == ')' && chars[i - 1] == '(') {
                stack.pop();
                stack.push('L');
            }
            else {
                stack.push(chars[i]);
            }
        }
        while(!stack.isEmpty()) {
            if(countL > 0 && !(stack.peek() == 'L')) {
                if(stack.peek() == '(') {
                    answer += (count + 1) * countL;
                    countL = 0;
                    count--;
                }
                else {
                    answer += (count + 1) * countL;
                    count++;
                    countL = 0;
                }
            }
            else if (stack.peek() == ')') {
                count++;
            }
            else if(stack.peek() == 'L') {
                countL++;
            }
            stack.pop();
        }
        return answer;
    }
}
