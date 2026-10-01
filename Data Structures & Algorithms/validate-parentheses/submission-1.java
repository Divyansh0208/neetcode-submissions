class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(char c:s.toCharArray()){
            if (c=='[' || c=='{' || c=='(') stack.push(c);
            else{
                if(!stack.isEmpty()){
                    if(stack.peek()==map.get(c)){   
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }else{
                    return false;
                }
             
            }
        }
        return stack.isEmpty();
    }
}
