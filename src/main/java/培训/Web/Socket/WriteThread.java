package 培训.Web.Socket;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WriteThread implements Runnable{
  private Socket socket;
  private String name;

  public WriteThread(Socket socket, String name) {
    this.socket = socket;
    this.name = name;
  }

  @Override
  public void run() {

    try {
      OutputStream outputStream = socket.getOutputStream();
      PrintWriter printWriter = new PrintWriter(outputStream);
      Scanner scanner = new Scanner(System.in);
      String s = null;
      while (true) {
        s = scanner.nextLine();
        printWriter.println(name + " " + s);
        printWriter.flush();
      }


    } catch (Exception e) {
      throw new RuntimeException(e);
    }


  }
}
