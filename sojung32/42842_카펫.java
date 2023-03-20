class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        
        for(int i=2;i<=Math.sqrt(area);i++){
            if(i*(area / i) == area && (i-2)*((area / i) - 2) == yellow){
                answer[0] = i > area / i ? i : area / i;
                answer[1] = i > area / i ? area / i : i;
            }
        }
        
        return answer;
    }
}
