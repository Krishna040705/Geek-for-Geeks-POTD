class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int originalColor = image[sr][sc];
        if (originalColor == newColor) return image; // No need to proceed

        dfs(image, sr, sc, originalColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int color, int newColor) {
        // Boundary check and color match check
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] != color)
            return;

        image[r][c] = newColor; // Change color

        // Move in 4 directions
        dfs(image, r + 1, c, color, newColor);
        dfs(image, r - 1, c, color, newColor);
        dfs(image, r, c + 1, color, newColor);
        dfs(image, r, c - 1, color, newColor);
    }
}
