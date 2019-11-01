public class Test2 {
    public int solution(int n) {
        String numbers = Integer.toString(n);
        String[] splited;
        splited = numbers.split("");
        int answer = 0;

        for(int i = 0; i < numbers.length(); i++){
            answer += Integer.parseInt(splited[i]);
        }

        return answer;
    }
}
