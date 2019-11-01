public class Test1 {
    public String solution(String phone_number){
        String[] nums;
        int size = phone_number.length();
        nums = phone_number.split("");
        phone_number = "";

        for(int i = 0; i < size - 4; i++){
            phone_number += "*";
        }
        for(int i = nums.length - 4; i < nums.length; i++) {
            phone_number += nums[i];
        }

        return phone_number;
    }
    // 입력받은 4자리 이상의 수 중에서 앞자리는 '*'로 대체하고 뒤의 네 자리만 반환해주는 프로그램
}