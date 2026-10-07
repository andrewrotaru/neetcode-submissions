class Solution {
    public boolean hasDuplicate(int[] nums) {
    
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++){
        int count = nums[i];
        

        if (map.containsKey(count)){
            return true;
        }else{
            map.put(count, 1);
        }
    }

return false;

    }
}