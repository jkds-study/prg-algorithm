class Solution {
    static int answer = 0;
    static int[] ch;  // 1: 더함, -1: 뺌

    public void DFS(int depth, int[] numbers, int n, int target) {
        if (depth == n) {
            int sum = 0;
            for (int i=0; i<n; i++) {
                sum += numbers[i] * ch[i];
            }
            if (sum == target) answer++;
        }
        else {
            ch[depth] = 1;    // 왼쪽 노드 - 덧셈
            DFS(depth+1, numbers, n, target);

            ch[depth] = -1;    // 오른쪽 노드 - 뺄셈
            DFS(depth+1, numbers, n, target);
        }
    }

    public int solution(int[] numbers, int target) {
        int n = numbers.length;
        ch = new int[n];

        DFS(0, numbers, n, target);
        return answer;
    }
}
