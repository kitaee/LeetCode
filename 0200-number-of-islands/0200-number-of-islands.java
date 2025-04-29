class Solution {

    static int N,M;
    static int answer;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static Queue<int[]> queue;

    public int numIslands(char[][] grid) {
        N = grid.length;
        M = grid[0].length;
        visited = new boolean[N][M];
        answer = 0;
        queue = new LinkedList<>();

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    visited[i][j] = true;
                    answer+=1;
                    bfs(i,j,grid);
                }
            }
        }

        return answer;
    }

    static void bfs(int x, int y, char[][] grid) {
        queue.offer(new int[]{x,y});
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            for(int i=0; i<4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];
                if(0<=nx && nx<N && 0<=ny && ny<M && !visited[nx][ny] && grid[nx][ny]=='1') {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
    }
}