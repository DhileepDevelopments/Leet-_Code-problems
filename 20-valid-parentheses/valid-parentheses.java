// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack=new Stack<>();
//         for(char ch:s.toCharArray()){
//             if(ch == '['||ch=='{'||ch=='('){
//                 stack.push(ch);
//             }else if(ch==')'||ch==']'||ch=='}'){
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 char top=stack.pop();
//                 if(ch==')'&&top!='('||
//                     ch=='}'&&top!='{'||
//                     ch==']'&&top!='['){
//                         return false;
//                     }
//             }
//         }
//         return stack.isEmpty();
        
//     }
// }
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (mapping.containsValue(c)) {
                stack.push(c);
            } else if (mapping.containsKey(c)) {
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();        
    }
}