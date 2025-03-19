class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max=0;
        int result =0;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                result = numbers[i]*numbers[j];
                if(max < result){
                    max = result;
                }
            }
        }
        answer = max;
        return answer;
    }
}