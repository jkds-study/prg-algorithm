import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        // 우선순위 큐를 사용한다.
        // 우선순위가 높은 데이터가 먼저 나가는 형태
        // 일반적으로 힙을 이용해 구현
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        for (int s: scoville) que.add(s);
        
        while (que.size() > 1 || (que.size() > 0 && que.peek() >= K)) {
            // 스코빌 지수가 K 이상이면 answer을 반환한다.
            if (que.peek() >= K) return answer;
            
            // 첫번째 음식과 두번째 음식을 꺼내 스코빌 지수를 구한다.
            int q1 = que.poll();
            int q2 = que.poll();
            que.add(q1 + (q2*2));
            answer++;
        }

        return -1;
    }
}
