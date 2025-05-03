class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("C")) {
                stack.pop(); // cancel the last score
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2); // double the last valid score
            } else if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();
                stack.push(last); // put last back
                stack.push(last + secondLast); // add last two
            } else {
                stack.push(Integer.parseInt(op)); // it's a number
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
