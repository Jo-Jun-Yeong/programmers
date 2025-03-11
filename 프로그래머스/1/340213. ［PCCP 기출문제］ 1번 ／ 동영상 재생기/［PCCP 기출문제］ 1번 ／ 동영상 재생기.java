class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        
        //commands를 입력받아 인식 후 그에 맞게 동작
        
        int [] hour_min = new int [2];

        hour_min[0] = Integer.parseInt(pos.split(":")[0]);
        hour_min[1] = Integer.parseInt(pos.split(":")[1]);
        
        int pos_len_ss = (hour_min[0]*60) + hour_min[1];
        
        int video_len_ss = (Integer.parseInt(video_len.split(":")[0])*60)
                            +
                        Integer.parseInt(video_len.split(":")[1]);
        
        int op_start_ss = (Integer.parseInt(op_start.split(":")[0])*60)
                            +
                        Integer.parseInt(op_start.split(":")[1]);
        
        int op_end_ss = (Integer.parseInt(op_end.split(":")[0])*60)
                            +
                        Integer.parseInt(op_end.split(":")[1]);
        for(int i =0; i<commands.length; i++){
            
            //10초 후
            if(commands[i].equals("next")){
                
                //남은시간이 10초 미만일 경우 마지막 위치로 이동
                if((video_len_ss - pos_len_ss) < 10){
                    pos_len_ss = video_len_ss;
                    
                    continue;
                }
                

                //증가 전 오프닝 구간이면 오프닝 마지막 구간으로
                if((op_start_ss<=pos_len_ss) && (pos_len_ss <= op_end_ss)){
                    pos_len_ss = op_end_ss;
                }
               //10초 증가
               pos_len_ss= pos_len_ss+10;
    
                if((op_start_ss<=pos_len_ss) && (pos_len_ss <= op_end_ss)){
                    pos_len_ss = op_end_ss;
                }

            }
            // 10초 이전
            else if(commands[i].equals("prev")){
                
                //현 위치가 00:10전이면 처음으로
                if(pos_len_ss<10){
                    pos_len_ss=0;
                    
                    continue;
                }
                
                //10초감소
               pos_len_ss= pos_len_ss-10;
                
                if((op_start_ss<=pos_len_ss) && (pos_len_ss <= op_end_ss)){
                    pos_len_ss = op_end_ss;
                }
                
            }
        }
        
        
        String answer = String.format("%02d", pos_len_ss/60) 
                            + ":" + String.format("%02d", pos_len_ss%60);

        return answer;
    }
}