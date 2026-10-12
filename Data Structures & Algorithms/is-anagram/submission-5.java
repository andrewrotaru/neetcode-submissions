class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> set1 = new HashMap<>();
        HashMap<Character, Integer> set2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char character1 = s.charAt(i);

            if (set1.containsKey(character1)){
                set1.put(character1, set1.get(character1) + 1);
            }else {
            set1.put(character1, 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            char character2 = t.charAt(i);

            if (set2.containsKey(character2)){
                set2.put(character2, set2.get(character2) +1);
            }else {

            set2.put(character2, 1);
            }

        }

        if (set1.equals(set2)){
            return true;

        }
return false;
    }
}
