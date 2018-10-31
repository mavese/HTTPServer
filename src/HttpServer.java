import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer
{
    public static void main(String[] args)
    {
        int port = 80;
        if (args.length > 1)
        {
            System.out.println("Invalid number of command line arguments entered, now exiting.");
            return;
        }
        else if (args.length == 1)
        {
            try
            {
                port = Integer.getInteger(args[0]);
            }
            catch (Exception e)
            {
                System.out.println("Invalid port number entered, now exiting.");
                return;
            }
        }

    }

    public class Server
    {
        public Server(int portNum)
        {
            port = portNum;
        }

        public void StartServer() throws IOException
        {
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            BufferedReader serverReceiver = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true)
            {
                if (serverReceiver.ready())
                {
                    String serverMessage = serverReceiver.readLine();
                }
            }
        }


        // Globals:
        private int port;
        private String serverName;
    }

}
