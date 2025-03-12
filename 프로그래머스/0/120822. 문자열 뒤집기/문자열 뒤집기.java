class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char [] c = my_string.toCharArray();
        
        for(int i=c.length-1; i>-1; i--){
            answer+=c[i];
        }
        
        return answer;
    }
}