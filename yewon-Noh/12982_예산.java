import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, i = 0;
        Arrays.sort(d);
        
        while (i < d.length) {
            if (d[i] > budget) break;
            budget -= d[i++];
        }
        answer = i;
        
        return answer;
    }
}
