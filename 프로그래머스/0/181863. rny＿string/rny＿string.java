class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String[] strArr = rny_string.split("");
        for(String str : strArr){
            if(str.equals("m")){
                answer += "rn";
            }
            else{
                answer += str;
            }
        }
        return answer;
    }
}