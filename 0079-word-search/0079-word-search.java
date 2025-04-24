class Solution {

    static int N,M;
    static int[][] visited;
    static boolean answer;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public boolean exist(char[][] board, String word) {
        N = board.length;
        M = board[0].length;
        answer = false;
        visited = new int[N][M];

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(word.charAt(0) == board[i][j]) {
                    visited[i][j] = 1;
                    dfs(board, word, 1, i, j);
                    visited[i][j] = 0;
                }
            }
        }

        return answer;
    }

    static void dfs(char[][] board, String word, int depth, int x, int y) {
        if(depth == word.length()) {
            answer = true;
            return;
        }

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(0<=nx && nx<N && 0<=ny && ny<M && visited[nx][ny]==0) {
                if(word.charAt(depth) == board[nx][ny]) {
                    visited[nx][ny] = 1;
                    dfs(board, word, depth+1, nx, ny);
                    visited[nx][ny] = 0;
                }
            }
        }
    }
}