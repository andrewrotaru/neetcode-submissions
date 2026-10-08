class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);


        }

int longest = 0;

        for (int i = 0; i < nums.length; i++){
            int number = nums[i];
            


            if (!set.contains(number - 1)){
                int current = number;
                int length = 0;

                while (set.contains(current)){
                    current++;
                    length++;

                }
                  longest = Math.max(longest, length);
            }
          
        }

        return longest;
    }
}
