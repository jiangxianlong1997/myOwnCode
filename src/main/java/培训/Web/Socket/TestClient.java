package 培训.Web.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {

  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("172.20.10.2", 50000);

    OutputStream outputStream = socket.getOutputStream();

    PrintWriter pw = new PrintWriter(outputStream);

    InputStream inputStream = socket.getInputStream();

    /**
     * InputStreamReader: 把字节流转化为字符流
     */
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String s = scanner.nextLine();
      pw.println(s);
      pw.flush();

      String message = bufferedReader.readLine();
      System.out.println(message);
    }



//    pw.println("hi");
//    pw.println("this");
//    pw.println("is");
//    pw.println("xianlong");
//    pw.flush();
  }

}
