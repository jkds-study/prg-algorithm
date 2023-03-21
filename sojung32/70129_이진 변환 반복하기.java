class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while(!"1".equals(s)){
            answer[0]++;
            answer[1] += s.replaceAll("1", "").length();
            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
        }
        
        return answer;
    }
}
