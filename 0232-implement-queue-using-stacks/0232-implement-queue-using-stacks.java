class MyQueue {
    Stack<Integer> in=new Stack<>();
    Stack<Integer> out=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        while(in.size()!=1){
            out.push(in.pop());
        }
        int a=in.pop();
        while(!out.isEmpty())  in.push(out.pop());
        return a;
    }
    
    public int peek() {
        while(!in.isEmpty()) out.push(in.pop());
        int a=out.peek();
        while(!out.isEmpty())  in.push(out.pop());
        return a;
    }
    
    public boolean empty() {
        return in.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */