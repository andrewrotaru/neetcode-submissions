class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int result = Integer.parseInt(tokens[0]);

        for (String value : tokens){

            if (value.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                result = a + b;
                stack.push(result);


            }else if (value.equals("-")){
                int b = stack.pop();
                int a = stack.pop();

                result = a - b;
                stack.push(result);

            }else if (value.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                result = a * b;
                stack.push(result);

            }else if (value.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                result = a / b;

                stack.push(result);

            }else {
                stack.push(Integer.parseInt(value));
            }
        }


        return result;
        
    }
}
