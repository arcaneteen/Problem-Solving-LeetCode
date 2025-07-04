class Solution {
    public String clearDigits(String s) {
        StringBuilder str=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&& ch<='9'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){ 
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}