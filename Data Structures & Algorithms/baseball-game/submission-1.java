class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (String character : operations){

            if (character.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
             result = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(result);

                
            }else if (character.equals("D")){
                 result = stack.peek() * 2;
                stack.push(result);

            }else if (character.equals("C")){
                stack.pop();

            }else {
                stack.push(Integer.parseInt(character));
            }
        }
        int answer = 0;

    while (!stack.isEmpty()){
        answer += stack.pop();

    }

    return answer;
        
    }
}