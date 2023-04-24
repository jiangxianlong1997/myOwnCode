package 培训.Web.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(50000);

    //accept()是一个阻塞的方法
    Socket socket = serverSocket.accept();

    InputStream inputStream = socket.getInputStream();

    /**
     * InputStreamReader: 把字节流转化为字符流
     */
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

    OutputStream outputStream = socket.getOutputStream();
    PrintWriter pw = new PrintWriter(outputStream);

    while (true) {
      String s = bufferedReader.readLine();
      System.out.println("客户端：" + s);
      pw.println("消息收到!");
      pw.flush();
    }

//    String s = bufferedReader.readLine();
//    while (s != null) {
//      System.out.println("客户端：" + s);
//      s = bufferedReader.readLine();
//    }



  }

}
