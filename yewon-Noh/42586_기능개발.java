import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int size = progresses.length;
    
        // 며칠 소요되는지 계산한다.
        Queue<Integer> period = new LinkedList<>();
        for (int i=0; i<size; i++) {
            int remaining =(int) Math.ceil((double)(100-progresses[i])/speeds[i]);
            period.offer(remaining);
        }
        
        while(!period.isEmpty()) {
            int count = 1;
            int target = period.poll();  // 첫번째 값을 꺼낸다.
            // 앞에 기능 보다 먼저 개발되는 뒤에 있는 기능의 수를 구한다.
            while (!period.isEmpty() && period.peek() <= target) {  
                period.poll(); 
                count++;
            }
            answer.add(count);
        }
        return answer;
    }
}
