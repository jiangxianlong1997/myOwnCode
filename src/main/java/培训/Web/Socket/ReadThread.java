package 培训.Web.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread implements Runnable{
  private Socket socket;

  public ReadThread(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try {
      InputStream inputStream = socket.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

      String message = null;
      while (true) {
        message= br.readLine();
        System.out.println(message);
      }
    } catch (IOException e) {
      System.out.println("连接中断");
      throw new RuntimeException(e);
    }

  }
}
