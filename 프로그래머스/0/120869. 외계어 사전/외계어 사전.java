class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String str : dic){
            for(int i = 0; i < spell.length; i++){
                int length = str.length();
                
                str = str.replaceAll(spell[i] , "");
                if(str.length() == length){
                    break;
                }
                else if(str.length() == 0 && i < spell.length -1){
                    break;
                }
                else if(str.length() == 0){
                    answer = 1;
                }
                
            }
        }
        return answer;
    }
}