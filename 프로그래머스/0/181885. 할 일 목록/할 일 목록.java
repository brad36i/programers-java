import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i =0; i < todo_list.length; i++){
            if(finished[i]){
                
            }
            else{
                list.add(todo_list[i]);    
            }
        }
        answer = list.toArray(new String[0]);
        return answer;
    }
}