package MyLeetCodeExersice.DataStructure;

/**请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
// 示例 1：
// 输入：s = "We are happy."
//输出："We%20are%20happy."
// 限制：
//
// 0 <= s 的长度 <= 10000
//
// Related Topics 字符串 👍 466 👎 0*/
public class Offer05 {
  public String replaceSpace(String s) {
    StringBuilder stringBuilder = new StringBuilder(s);
    for (int i = 0; i < stringBuilder.length(); i++) {
      if (stringBuilder.charAt(i) == ' ') {
        stringBuilder.delete(i, i + 1 );
        stringBuilder.insert(i,"%20");
      }
    }
    return stringBuilder.toString();
  }

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('a');
    stringBuilder.append('b');
    stringBuilder.append('c');
    stringBuilder.append('d');
    stringBuilder.delete(3,4);
    System.out.println(stringBuilder);
    Offer05 offer05 = new Offer05();
    System.out.println(offer05.replaceSpace("We are happy."));
  }
}
