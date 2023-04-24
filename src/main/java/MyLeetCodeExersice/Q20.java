package MyLeetCodeExersice;

import java.util.Stack;

/**给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     有效字符串需满足：
     左括号必须用相同类型的右括号闭合。
     左括号必须以正确的顺序闭合。
     每个右括号都有一个对应的相同类型的左括号。

     示例 1：
    输入：s = "()"
    输出：true
     示例 2：
    输入：s = "()[]{}"
    输出：true
     示例 3：
    输入：s = "(]"
    输出：false
   提示：
   1 <= s.length <= 10⁴
   s 仅由括号 '()[]{}' 组成
   Related Topics 栈 字符串 👍 3887 👎 0
*/
public class Q20 {
    public boolean isValid1(String s) {
      if (s.length() > 10000) return false;
      if (s.length() == 0) return true;
      Stack<Character> stack = new Stack<>();
      for (char c:
      s.toCharArray()) {
        if (c == '(') stack.push(')');
        else if (c == '[') stack.push(']');
        else if (c == '{') stack.push('}');
        else if (stack.empty() || c != stack.pop() ) return false;
      }
      return stack.empty();
    }

//  public boolean isValid(String s) {
//
//    Stack<Character> stack=new Stack<Character>();
//    for(char c:s.toCharArray()){
//      if(c=='(')
//        stack.push(')');
//
//      else if(c=='[')
//        stack.push(']');
//      else if(c=='{')
//        stack.push('}');
//      else if(stack.empty()||c!=stack.pop())
//        return false;
//    }
//    return stack.empty();
//  }

    public static void main(String[] args) {
      Q20 q20 = new Q20();
      System.out.println(q20.isValid1("{{{{}]}}"));
      System.out.println(q20.isValid1("{{([)]}}"));
      System.out.println(q20.isValid1("()[]{}"));
    }
}
