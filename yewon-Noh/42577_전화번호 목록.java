import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 전화번호들을 map에 저장
        HashMap<String, String> map = new HashMap();
        for (String s: phone_book) map.put(s, "prefix");
        
        for (String s: phone_book) {
            // 각 번호를 한자리씩 늘려가며 해당 번호를 접두사로 갖는 전화번호가 존재하는지 확인
            for (int i=1; i<s.length(); i++) {
                if (map.containsKey(s.substring(0,i))) return false;               
            }
        }
        return answer;
    }
}
