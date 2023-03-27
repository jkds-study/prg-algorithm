class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        int[] primeCnt = new int[number];
        
        primeCnt[0] = 1;
        for(int i=2;i<=number;i++){
            primeCnt[i-1] = 2;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i % j == 0){
                    primeCnt[i-1]++;
                    if(Math.sqrt(i) != j){
                        primeCnt[i-1]++;
                    }
                }
            }
            if(primeCnt[i-1] <= limit){
                answer += primeCnt[i-1];
            } else {
                answer += power;
            }
        }
        
        return answer;
    }
}
