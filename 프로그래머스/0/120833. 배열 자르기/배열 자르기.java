class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        //numbers의 [num1]부터 [num2]까지 잘라서 반환
        int[] answer = {};
        answer = new int [num2-num1 +1];
        
        //for(int i =0; i<answer.length; i++){ }
        int i=0;
        while(i<answer.length){
            for(int j=num1; j<num2+1; j++){
                answer[i]=numbers[j];
                i++;
            } 
        }


            
        return answer;
    }
}