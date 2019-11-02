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
}