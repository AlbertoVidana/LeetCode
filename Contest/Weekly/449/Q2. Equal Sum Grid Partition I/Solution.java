class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int d = grid.length;
        int b = grid[0].length;
        int sumA = 0, sumB = 0;
        //Comparation horizontaly
        for (int i = 0; i < grid.length / d; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sumA += grid[i][j];
            }
        }
        for (int i = (grid.length / d); i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sumB += grid[i][j];
            }
        }
        System.out.println(sumA + " " + sumB);
        if (sumA == sumB) return true;
        sumA = 0;
        sumB = 0;
        // Verticaly:
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length / b; j++) {
                sumA += grid[i][j];
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length / b; j < grid[i].length; j++) {
                sumB += grid[i][j];
            }
        }
        System.out.print(sumA + " " + sumB);
        if (sumA == sumB) return true;
        return false;
    }
}