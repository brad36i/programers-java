class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int num : array){
            str += num;
        }
        for(int i = 0; i < 10; i++){
            if(i == 7){
                continue;
            }
            str = str.replaceAll(String.valueOf(i),"");
        }
        answer = str.length();
        return answer;
    }
}