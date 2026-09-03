class Solution {
    public int maxArea(int[] heights) {
        int max = 0, left = 0, right = heights.length - 1;
        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            if ((height * width) > max) {
                max = height * width;
            } else if (heights[left] < heights[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
