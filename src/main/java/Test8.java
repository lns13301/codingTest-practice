public class Test8 {
    public boolean solution(int x) {
        String[] split = (x + "").split("");
        int one = 0;

        for(int i = 0; i < split.length; i++) {
            one += Integer.parseInt(split[i]);
        }
        return x % one == 0;
    }
}
