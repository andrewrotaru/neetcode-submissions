class Solution {
    public boolean isPathCrossing(String path) {

        HashSet<String> set = new HashSet<>();

        int x = 0;
        int y = 0;
        set.add("0,0");

        for (int i = 0; i < path.length(); i++){
            char coordinate = path.charAt(i);
            if (coordinate == 'N'){
                y++;

                if (!set.contains(x + "," + y)){
                set.add(x + "," + y);

                }else {
                    return true;
                }
                
                

            }else if (coordinate =='S'){
                y--;
                 if (!set.contains(x + "," + y)){
                set.add(x + "," + y);

                }else {
                    return true;
                }
               

            }else if (coordinate == 'W'){
                x--;
                 if (!set.contains(x + "," + y)){
                set.add(x + "," + y);

                }else {
                    return true;
                }
                


            }else if (coordinate == 'E'){
                x++;
                 if (!set.contains(x + "," + y)){
                set.add(x + "," + y);

                }else {
                    return true;
                }
                

            }
        }
    return false;

       
    }
}