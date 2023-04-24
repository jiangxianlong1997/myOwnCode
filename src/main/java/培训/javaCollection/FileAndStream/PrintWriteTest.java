package 培训.javaCollection.FileAndStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriteTest {

  public static void main(String[] args) throws IOException {
    Writer writer = new FileWriter("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/print.txt");
    PrintWriter printWriter = new PrintWriter(writer);
    printWriter.println("abcdefg");
    printWriter.print("a");
    printWriter.flush();
  }

}
