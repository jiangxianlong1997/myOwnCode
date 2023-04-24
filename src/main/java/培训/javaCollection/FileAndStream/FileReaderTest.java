package 培训.javaCollection.FileAndStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

  public static void main(String[] args) throws IOException {
    FileReader fileReader = new FileReader("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/Read.txt");
    int data = fileReader.read();
    while (data != -1) {
      System.out.print((char) data);
      data = fileReader.read();
    }
    fileReader.close();

  }

}
