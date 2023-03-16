import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] nums = new String[numbers.length];
        
        for (int i=0; i<numbers.length; i++)
            nums[i] = Integer.toString(numbers[i]);
        
        Arrays.sort(nums, (o1, o2) -> (o2+o1).compareTo(o2+o1));
        
        for (String s: nums) answer += s;
        answer = answer.replaceAll("^0+", "");
        
        if (answer.length() == 0) return "0";
        return answer;
    }
}
