import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ServerSocketThread extends Thread {

    private Socket socket;

    ServerSocketThread(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try {
            String clientMsg = "";
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            outputStream.writeUTF("Client Connected... Waiting for players...");

            while (true){
                String data = inputStream.readUTF();
                System.out.println(data);
            }
        } catch (IOException e){
            System.out.println("FATALERROR");
        }
    }

}
