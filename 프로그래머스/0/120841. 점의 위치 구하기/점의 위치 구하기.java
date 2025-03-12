class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        //[0]이 양수면 1, 4분면
        //[1]이 양수면 1, 2분면
        //[0]이 음수면 2, 3분면
        //[1]이 음수면 3, 4분면
        if(dot[0]>0){
            if(dot[1]>0){
                answer=1;
            }else answer=4;
        }else {
            if(dot[1]>0){
                answer=2;
            }else answer=3;
        }
        
        return answer;
    }
}