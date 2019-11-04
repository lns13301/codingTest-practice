public class Test12 {
    public int solution(int num) {
        int times = 0;

        for(int i = 0; i < 501; i++) {
            if(i == 500)
                return -1;
            if(num == 1) {
                break;
            }
            if(num % 2 == 0) {
                num /= 2;
            }
            else {
                num = num * 3 + 1;
            }
            System.out.println("Num = " + num + ", Times = " + times);
            times++;
        }
        return times;
    }
}
