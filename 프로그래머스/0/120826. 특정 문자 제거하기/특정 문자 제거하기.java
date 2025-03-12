class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        String [] str = my_string.split(letter);
        
        for(int i =0; i<str.length; i++){
            answer += str[i];
        }
        
        return answer;
    }
}