package alhuck.challenges.mediumlc;

public class uniquePaths {

    // m = 3, n = 2
    public static int calculateUniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int j = 0; j < m; j++) {
            dp[j][0] = 1;
        }
        for (int x = 1; x < m; x++) {
            for (int y = 1; y < n; y++) {
                dp[x][y] = dp[x - 1][y] + dp[x][y - 1];
            }
        }
        return dp[m-1][n-1];
    }

    // [[0,1], [0,0]]
    public static int uniquePathsWithObstacle(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = 1;
            } else {
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[0][j] = 1;
            } else {
                break;
            }
        }

        for (int x = 1; x < m; x++) {
            for (int y = 1; y < n; y++) {
                if (obstacleGrid[x][y] == 0) {
                    dp[x][y] = dp[x - 1][y] + dp[x][y - 1];
                }


            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {

//        System.out.println(calculateUniquePaths(3, 2));
//        int[][] og = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
//        int[][] og = {{0, 1}, {0, 0}};
//        int[][] og = {{0, 0}, {0, 1}};
//        int [][] og = {{0}};
//        int[][] og = {{0, 0}};
        int[][] og = {{1, 0}};
        System.out.println(uniquePathsWithObstacle(og));
    }
}
