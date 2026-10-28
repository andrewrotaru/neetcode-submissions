class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();


        if (s.length() != t.length()){
            return false;
        }
        


        for (int i = 0; i < s.length(); i++){
            char character = s.charAt(i);

            if (map1.containsKey(character)){
                map1.put(character, map1.get(character) + 1);

            }else {
                map1.put(character, 1);

            }

        }

        for (int i = 0; i < t.length(); i++){
            char character = t.charAt(i);

            if (map2.containsKey(character)){
                map2.put(character, map2.get(character) + 1);

            }else {
                map2.put(character, 1);
            }
        }


        if (map1.equals(map2)){
            return true;

        }else {
            return false;
        }

        

    }
}
