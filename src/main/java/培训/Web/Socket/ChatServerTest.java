package 培训.Web.Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServerTest {

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(50000);
    Socket accept = serverSocket.accept();

    Thread readThread = new Thread(new ReadThread(accept));
    Thread writeThread = new Thread(new WriteThread(accept, "服务器"));

    readThread.start();
    writeThread.start();
  }

}
