class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        double d_num1 = num1+0.0;
        double d_num2 = num2+0.0;
        
        answer = (int)((d_num1/d_num2) * (1000));
        
        return answer;
    }
}