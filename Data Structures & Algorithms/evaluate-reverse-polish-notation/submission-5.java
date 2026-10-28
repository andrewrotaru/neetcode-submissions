class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int result = Integer.parseInt(tokens[0]);


        for (int i = 0; i < tokens.length; i++){

            String character = tokens[i];

            if (character.equals("+")){
                int a = stack.pop();
                int b = stack.pop();

                result = a + b;
                stack.push(result);
            }else if(character.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                result = a * b;
                stack.push(result);

            }else if (character.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                result = a - b;
                stack.push(result);

            }else if (character.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                result = a / b;

                stack.push(result);

                
            }else {
                stack.push(Integer.parseInt(character));
            }

        }
        return result;
    }
}
