class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        answer = new int[n][n];
        int x = 0;
        int y = 0;
        int d = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, - 1, 0};
        for(int i = 1; i <=  n*n; i++){
            answer[x][y] = i;
            if(n == 1){
                break;
            }
            
            if(x+dx[d] == n || y+dy[d] == n || x+dx[d] == -1|| y+dy[d] == -1){
                d = (d + 1) % 4;
            }
            if(answer[x+dx[d]][y+dy[d]] > 0){
                d = (d + 1) % 4;
            }
            x += dx[d];
            y += dy[d];
        }
        return answer;
    }
}