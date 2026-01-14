class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] curse = new int[100];
        int num = 1;
        int index = 0;
        while(index != n){
            if(num % 3 != 0 && String.valueOf(num).contains("3") != true){
                answer = num;
                index++;
            }
            num++;
        }
        return answer;
    }
}