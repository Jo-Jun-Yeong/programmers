class Solution {
    public int solution(int n) {
        int answer=0;
        int su=n;
        
        while(su >=1 ){
            answer += su%10;
            su=su/10;
        }
        
        return answer;
    }
    
    
}