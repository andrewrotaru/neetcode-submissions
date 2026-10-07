class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);

                
            }else{
                map.put(nums[i], 1);

            }
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int freq = entry.getValue();

            if (bucket[freq] == null){
                bucket[freq] = new ArrayList<>();

            }
                bucket[freq].add(number);

        }
        

        int index = 0;
        int[] answer = new int[k];

        for (int i = bucket.length - 1; i >= 0; i--){
            if (bucket[i] != null){
                for (int number : bucket[i]){
                    answer[index] = number;
                    index++;


                    if (index == k){
                return answer;
                }
            }

            
            }
        }

        return answer;
        
    }
}
