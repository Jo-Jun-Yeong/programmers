class Solution {
    public String solution(String my_string, int n) {
        String str=my_string.trim();
        
        String answer = "";
        
        char c [] = my_string.toCharArray();
        
        for(int j = 0; j<str.length(); j++){
            for(int i=0; i<n; i++){
                 answer += str.charAt(j);
            }        
        }
        
        
        return answer;
    }
}