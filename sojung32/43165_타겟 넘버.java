class Solution {
    private static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target);
        
        return answer;
    }
    
    public static void dfs(int index, int numbers[], int target){
        
        if(index < numbers.length){
            dfs(index + 1, numbers, target);

            numbers[index] *= -1;
            dfs(index + 1, numbers, target);
        } else {
            int sum = 0;
            for(int i=0;i<numbers.length;i++){
                sum += numbers[i];
            }
            if(sum == target){
                answer++;
            }
        }    
    }
}
