import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] strArr = myString.split("x");
        List<String> list = new ArrayList<>();
        for(String str : strArr){
            if(str.equals("")){
                
            }
            else{
                list.add(str);
            }
        }
        list.sort(Comparator.naturalOrder());
        answer = list.toArray(new String[0]);
        return answer;
    }
}