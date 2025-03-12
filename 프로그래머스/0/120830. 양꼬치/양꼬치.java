class Solution {
    public int solution(int n, int k) {
        //양꼬치n 음료k
        int yang_price = n*12000;
        int um_price = (k-(n/10))*2000;
        
        
        int answer = yang_price + um_price;
        return answer;
    }
}