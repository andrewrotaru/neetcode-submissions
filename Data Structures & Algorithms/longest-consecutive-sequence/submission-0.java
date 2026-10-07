class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);

        }


        int longest = 0;

        for (int number : set){

            if (!set.contains(number - 1)){
                int current = number;
                int length = 0;

                while (set.contains(current)){
                    length++;
                    current++;

                }

                longest = Math.max(longest , length);
            }
        }

        return longest;
    }
}
