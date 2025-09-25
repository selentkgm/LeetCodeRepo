class Solution {
    public int maxArea(int[] height) {
        int x = 0;
        int y = height.length - 1;
        int maxCap = 0;

        while (x < y) {
            int width = y - x;
            int h = Math.min(height[x], height[y]);
            int area = width * h;
            maxCap = Math.max(maxCap, area);

            if (height[x] < height[y]) {
                x++;
            } else {
                y--;
            }
        }

        return maxCap;
    }
}
