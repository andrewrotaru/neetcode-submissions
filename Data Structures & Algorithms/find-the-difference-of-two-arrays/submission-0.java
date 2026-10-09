class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        for (int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);

        }

        for (int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }


        

        for (int number : set){
            if (!set2.contains(number)){
                list1.add(number);

                
            }
        }


        for (int number1 : set2){
            if (!set.contains(number1)){
                list2.add(number1);

            }
        }

    answer.add(list1);
        answer.add(list2);

        return answer;



    }
}