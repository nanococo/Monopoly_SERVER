import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class MonopolyServer {
    private static final int port = 35557;

    void serverStart(){
        try{
            ServerSocket server = new ServerSocket(port);

            Socket client = server.accept();

            DataOutputStream buffer = new DataOutputStream(client.getOutputStream());

            buffer.writeUTF ("Hello World");

        } catch (IOException e){
            System.out.println("FATAL SERVER ERROR");
        }
    }

}
