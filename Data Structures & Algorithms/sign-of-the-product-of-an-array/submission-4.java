class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
       // int result = 0;
        

        for (int each : nums){
            //product *= each;
            if( each == 0) return 0;
            if(each < 0) product = product * -1;
        }
        return product;

//         if (product > 0){
//             return 1;

//         }else if (product < 0){
//             return -1;

//         }else if (product == 0){
//         return  0;
//         }

// return;
        
    }
}