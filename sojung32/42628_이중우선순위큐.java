import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> pQueAsc = new PriorityQueue<>(); // 최소 힙
        PriorityQueue<Integer> pQueDesc = new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙

        for(int i=0;i<operations.length;i++){
            String oper = operations[i].substring(0, 1);
            int num = Integer.parseInt(operations[i].split(" ")[1]);
            if("I".equals(oper)){
                pQueAsc.add(num);
                pQueDesc.add(num);
            } else {
                if(num < 0){ // 최솟값 삭제
                    if(!pQueAsc.isEmpty()){
                        int peek = pQueAsc.poll();
                        pQueDesc.remove(peek);
                    }
                } else { // 최댓값 삭제
                    if(!pQueDesc.isEmpty()){
                        int peek = pQueDesc.poll();
                        pQueAsc.remove(peek);
                    }
                }
            }
        }

        if(pQueAsc.isEmpty()){
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = pQueDesc.peek();
            answer[1] = pQueAsc.peek();
        }

        return answer;
    }
}
