class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        
        String [] s = {"a","e","i","o","u"};
        
        for(int i=0; i<s.length; i++){
             answer = answer.replace(s[i], "");
        }
        return answer;
    }
}