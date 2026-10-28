class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){

            char character = s.charAt(i);

            if(character == '(' ||
            character == '{' ||
            character == '['){

                stack.push(character);

            }else {
                if (stack.isEmpty()){
                    return false;
                }
            

                 if (character == ')' && stack.peek() == '('){
                    stack.pop();

                }else if (character == '}' && stack.peek() == '{'){
                    stack.pop();

                }else if (character == ']' && stack.peek() == '['){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
        
    }
}
