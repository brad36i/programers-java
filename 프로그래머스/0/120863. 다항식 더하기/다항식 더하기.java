class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] strArr = polynomial.split("\\s\\+\\s");
        int xnum = 0;
        int num = 0;
        for(String str : strArr){
            if(str.charAt(str.length()-1) == 'x'){
                if(str.length() == 1){
                    xnum++;
                }
                else{
                    xnum += Integer.parseInt(str.substring(0, str.length() -1));
                }
            }
            else{
                num += Integer.parseInt(str);
            }
        }
        if(xnum > 0){
            if(xnum == 1){
                answer += "x";
            }
            else{
                answer += xnum + "x";
            }
        }
        if(xnum > 0 && num > 0){
            answer += " + ";
        }
        if(num > 0){
            answer += num;
        }
        return answer;
    }
}