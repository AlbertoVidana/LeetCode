class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int m = mat.length;
        int n = mat[0].length;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                if (mat[row][col] == 0) continue;

                boolean special = true;
                //cheking row
                for (int i = 0; i < m; i++) {
                    if (i != row && mat[i][col] == 1) {
                        special = false;
                        break;
                    }
                }
                //cheking col
                for (int i = 0; i < n; i++) {
                    if (i != col && mat[row][i] == 1) {
                        special = false;
                        break;
                    }
                }

                if (special) {
                    count++;
                }
            }
        }

        return count;
    }
}