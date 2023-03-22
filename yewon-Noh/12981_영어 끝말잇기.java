import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0 ,0};
        int num=1, turn = 1; // 번호, 차례
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put(words[0], 1);
        
        for (int i=1; i<words.length; i++) {
            num++;
            
            // 이전 단어의 마지막 문자로 시작하지 않거나, 중복된 경우 탈락!
            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) || map.containsKey(words[i])) {
                answer[0] = num;
                answer[1] = turn;
                break;
            }
            map.put(words[i], 1);

            if (num >= n) {
                turn++;
                num=0;
            }
        }
        return answer;
    }
}
