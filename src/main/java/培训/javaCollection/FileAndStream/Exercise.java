package 培训.javaCollection.FileAndStream;

import java.io.*;
import java.util.Objects;

public class Exercise {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/");
        System.out.println("the file path is : /Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/");
        for (File f :
                Objects.requireNonNull(file.listFiles())) {
            System.out.println(f.getPath());
            System.out.println(f.getName());
            System.out.println("--------------");
        }
        File demo1 = new File("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/Demo1.txt");
        File demo2 = new File("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/Demo2.txt");
        File test = new File("/Users/xianlong/Desktop/myOwnCode/src/main/java/培训/javaCollection/FileAndStream/Test.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(demo1));
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(demo2));
            BufferedWriter bufferedWriter3 = new BufferedWriter(new FileWriter(test));
            bufferedWriter.write("Neuedu ");
            bufferedWriter2.write("hello");
            bufferedWriter.flush();
            bufferedWriter2.flush();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(demo1));
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(demo2));
            bufferedWriter3.write(bufferedReader.readLine() + bufferedReader2.readLine());
            bufferedWriter3.flush();
            bufferedReader.close();
            bufferedReader2.close();
        } catch (IOException e) {
            throw new IOException();
        }

    }
}

