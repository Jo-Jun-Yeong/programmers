class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int count = (intervals[0][1]-intervals[0][0]+1)+(intervals[1][1]-intervals[1][0]+1);
        //임시 저장할 정수형 배열
        int [] tmp_a;
        int [] tmp_b;
        int tmp =0;
        answer = new int[count];
        
        //answer
        for(int i=0; i<count;){
            
            //intervalse의 값 [1,3][0,4]
            for(int r = 0; r<intervals.length; r++){
                
                //intervals[0]의 값 [1,3]까지의 값
                for(int j=intervals[r][0]; j<intervals[r][1]+1; j++){
                    answer[i] = arr[j];
                    i++;
                }

            }
            
        }
        

        
        return answer;
    }
}