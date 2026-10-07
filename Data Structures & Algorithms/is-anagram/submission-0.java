class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();



        if (s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++){

            char character1 = s.charAt(i);
            char character2 = t.charAt(i);

            if (map1.containsKey(character1)){
                map1.put(character1, map1.get(character1) + 1);

            }else {
                map1.put(character1, 1);
            }


            if (map2.containsKey(character2)){
                map2.put(character2, map2.get(character2) + 1);

            }else {
                map2.put(character2, 1);
            }
        }

        if (!map1.equals(map2) ){
            return false;
        }

        return true;
    }
    

    }


