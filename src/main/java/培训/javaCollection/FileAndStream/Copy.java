package 培训.javaCollection.FileAndStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

  public static void main(String[] args) throws IOException {
    File file = new File(
        "/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/Test.txt");
    File output = new File(
        "/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/Paste.txt");
    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));
    String line;
    while ((line = bufferedReader.readLine()) != null) {
      bufferedWriter.write(line);
      bufferedWriter.newLine();
    }
    bufferedWriter.flush();
    bufferedReader.close();
  }
}
