public class Test7 {
    public int[] solution(long n) {
        String temp = n + "";
        String[] split = temp.split("");
        int answer[] = new int[split.length];

        for(int i = 0; i < split.length; i++){
            answer[i] = Integer.parseInt(split[split.length - i - 1]);
        }
        return answer;
    }
}
