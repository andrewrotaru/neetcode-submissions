class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length - 1;

        int biggest = 0;

        while (left < right){

            int width = right - left;
            int height = Math.min(heights[left], heights[right]);

            int area = height * width;

            biggest = Math.max(biggest, area);

            if (heights[right] < heights[left]){
                right--;

            }else {
                left++;
            }

        }

        return biggest;
    }
}
