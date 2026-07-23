class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{' ){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()) return false;
            if(ch == ')' && stack.pop() == '(') continue;
            if(ch == ']' && stack.pop() == '[') continue;
            if(ch == '}' && stack.pop() == '{') continue;
            
            return false;
        }

        return stack.isEmpty();
    }
}
