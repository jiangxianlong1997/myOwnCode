package 培训.Web.Socket;

import java.io.IOException;
import java.net.Socket;

public class ChatClientTest {

  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("localhost", 50000);

    Thread readThread = new Thread(new ReadThread(socket));
    Thread writeThread = new Thread(new WriteThread(socket, "客户端"));

    readThread.start();
    writeThread.start();
  }
}
