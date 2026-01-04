import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        if(list.isEmpty()){
            list.add("EMPTY");
        }
        answer = list.toArray(new String[0]);
        return answer;
    }
}