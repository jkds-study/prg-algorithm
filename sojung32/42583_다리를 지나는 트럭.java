import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length;
        
        Queue<Integer> que = new LinkedList<>();
        
        int weightSum = 0;
        for(int i=0;i<truck_weights.length;i++){
            while(true){
                if(que.size() < bridge_length) {
                    if(weightSum + truck_weights[i] <= weight){
                        que.add(truck_weights[i]);
                        weightSum += truck_weights[i];
                        break;
                    } else {
                        que.add(0);
                    }
                } else {
                    weightSum -= que.poll();
                    answer++;
                }
            }
        }

        while(!que.isEmpty()){
            que.remove();
            answer++;
        }

        return answer;
    }
}
