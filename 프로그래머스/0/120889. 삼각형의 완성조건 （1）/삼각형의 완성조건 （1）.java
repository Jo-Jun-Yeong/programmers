class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max=getMax(sides);
        
        answer = getResult(max, sides);
            
        
        return answer;
    }
    
    public int getMax(int [] arry){
        
        int max =arry[0];
        
        int i=0; 
        while(i<arry.length){
            
            if(max < arry[i]){
                max = arry[i];
            }
            i++;
        }
        
        return max;
    }
    
    public int getResult (int max, int [] arry){
        //max > (sides의값들합-max)
        int sum=0;
        
        for(int i=0; i<arry.length; i++){
            sum+= arry[i];
        }
        
        return (max < (sum-max)) ?  1 :  2;

    }
}