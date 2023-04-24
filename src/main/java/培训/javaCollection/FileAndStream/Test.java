package 培训.javaCollection.FileAndStream;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/a.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}
