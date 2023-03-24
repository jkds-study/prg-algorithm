class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int RT = 0;
        int CF = 0;
        int JM = 0;
        int AN = 0;
        
        for(int i=0;i<survey.length;i++){
            char q1 = survey[i].charAt(0);
            char q2 = survey[i].charAt(1);
            int score = choices[i] - 4;
            
            switch(q1){
                case 'R':
                    RT += score;
                    break;
                case 'T':
                    RT += score * -1;
                    break;
                case 'C':
                    CF += score;
                    break;
                case 'F':
                    CF += score * -1;
                    break;
                case 'J':
                    JM += score;
                    break;
                case 'M':
                    JM += score * -1;
                    break;
                case 'A':
                    AN += score;
                    break;
                case 'N':
                    AN += score * -1;
                    break;
            }
        }
        answer = RT > 0 ? "T" : "R";
        answer += CF > 0 ? "F" : "C";
        answer += JM > 0 ? "M" : "J";
        answer += AN > 0 ? "N" : "A";
        
        return answer;
    }
}
