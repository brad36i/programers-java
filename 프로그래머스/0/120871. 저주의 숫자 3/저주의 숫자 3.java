class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] curse = new int[100];
        int num = 1;
        int index = 0;
        while(index < 100){
            if(num % 3 != 0 && String.valueOf(num).contains("3") != true){
                curse[index] = num;
                index++;
            }
            num++;
        }
        answer = curse[n - 1];
        return answer;
    }
}