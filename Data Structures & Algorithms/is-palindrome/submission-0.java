class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;

        String lower = s.toLowerCase();

        while (left < right){
            if (!Character.isLetterOrDigit(lower.charAt(left))){
                left++;
            }
            else if (!Character.isLetterOrDigit(lower.charAt(right))){
                right--;

            } else if (lower.charAt(left) != lower.charAt(right)){
                return false;
            }
            else {
                left++;
                right--;
            }
        }

       
        return true;
    }
}
