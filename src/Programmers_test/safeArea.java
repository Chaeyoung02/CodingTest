package Programmers_test;

public class safeArea {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] map = new int[board.length][board.length];
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j < board.length; j++){
                map[i][j] = board[i][j];
            }
        }
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] ==1){
                    updateFuction(i, j, board.length, map);
                }
            }
        }

        for(int i = 0; i< map.length; i++){
            for(int j = 0; j < map.length; j++){
                if(map[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
    private void updateFuction(int i, int j, int n, int[][] map){
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for(int k = 0; k < 8; k++){
            int nx = i + dx[k];
            int ny = j + dy[k];

            if(nx >= 0 && nx < n && ny >=0 && ny < n){
                map[nx][ny] = 1;
            }
        }
    }

}
