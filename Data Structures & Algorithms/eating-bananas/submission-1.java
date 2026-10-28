class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        for (int speed : piles){
            right = Math.max(speed, right);

        }

        while (left < right){
            int mid = (right + left) / 2;
            int hours = 0;


            for (int pile : piles){
                hours += (int) Math.ceil((double) pile / mid);

            }

            if (hours > h){
                left = mid + 1;

            }else {
                right = mid;
            }
        }

        return left;
        
    }
}
