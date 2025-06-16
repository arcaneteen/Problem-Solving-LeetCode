class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int l=temperatures.length;
        int[] answer=new int[l];
        for(int i=l-1;i>=0;i--){
           while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()] ){
            stack.pop();//piche wala temp km h (jyada hona chahiye)
            }
            if(!stack.isEmpty()){
                 answer[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return answer;
    }
}