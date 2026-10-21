class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        for (int i = 0; i < board.length; i++){
            
            HashSet<Character> row = new HashSet<>();

            for (int j = 0; j < board[i].length; j++){
                char number = board[i][j];

                if (number == '.'){
                    continue;
                }

                if (row.contains(number)){
                    return false;

                }
                    row.add(number);
                
            }
        }


        for (int i = 0; i < board.length; i++){

            HashSet<Character> col = new HashSet<>();

            for (int j = 0; j < board.length; j++){
                char number = board[j][i];

                if (number == '.'){
                    continue;

                }

                if (col.contains(number)){
                    return false;

                }

                col.add(number);
            }
        }



        for (int row = 0; row < 9; row += 3){
            for (int col = 0; col < 9; col += 3){

                HashSet<Character> grid = new HashSet<>();


                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++){
                        
                        char number = board[row + i][col + j];

                        if (number == '.'){
                            continue;

                        }

                        if (grid.contains(number)){
                            return false;

                        }

                        grid.add(number);
                    }
                }
            }
        }

        return true;
    }
   }