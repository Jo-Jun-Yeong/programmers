class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode=false;
        String ret="";
        
        for(int i=0; i<code.length(); i++){
            if(!mode){
                if(!(code.charAt(i)=='1')){
                    if((i%2==0)){
                        ret+=code.charAt(i);
                    }
                }else if((code.charAt(i)=='1')){
                    mode= (!mode);
                }
            } else if(mode){
                if(!(code.charAt(i)=='1')){
                    if((i%2==1)){
                        ret+=code.charAt(i);
                    }
                }else if((code.charAt(i)=='1')){
                    mode= (!mode);
                }
            }
        }
            
        return ret.isEmpty() ? "EMPTY" : ret;
    }
}