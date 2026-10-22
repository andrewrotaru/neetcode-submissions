class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();
    

    public MinStack() {
        
    }
    
    public void push(int val) {

        stack.push(val);

        if (min.isEmpty()){
            min.push(val);
            
        }else if (val <= min.peek()){
            min.push(val);

        }else {
            min.push(min.peek());
        }
        
    }
    
    public void pop() {

        min.pop();
        stack.pop();
        
    }
    
    public int top() {

        return stack.peek();
        
    }
    
    public int getMin() {

        return min.peek();
        
    }
}
