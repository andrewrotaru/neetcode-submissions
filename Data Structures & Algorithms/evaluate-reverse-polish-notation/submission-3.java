class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int result = Integer.parseInt(tokens[0]);

        for (int i = 0; i < tokens.length; i++){
            String current = tokens[i];


            if (current.equals("+")){

               int b = stack.pop();
               int a = stack.pop();

                result = a + b;
                stack.push(result);


            }else if (current.equals("*")){

                int b = stack.pop();
                int a = stack.pop();

                result = a * b;
                stack.push(result);

            }else if (current.equals("-")){
                int b = stack.pop();
                int a = stack.pop();

                result = a - b;
                stack.push(result);

            }else if (current.equals("/")){
                int b = stack.pop();
                int a = stack.pop();

                result = a / b;
                stack.push(result);
            }
            
            
            else{

            stack.push(Integer.parseInt(current));
            }
        }
        
        return result;
    }
}
