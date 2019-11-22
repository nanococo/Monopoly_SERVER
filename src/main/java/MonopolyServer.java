import javax.naming.ldap.SortKey;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class MonopolyServer {
    private static final int port = 35557;
    private static final PlayerCount playerCount = PlayerCount.TWO_PLAYERS;

    private Socket player1;
    private Socket player2;
    private Socket player3;
    private Socket player4;
    private Socket player5;
    private Socket player6;
    private Socket player7;
    private Socket player8;

    private ServerSocketThread sct1;
    private ServerSocketThread sct2;
    private ServerSocketThread sct3;
    private ServerSocketThread sct4;
    private ServerSocketThread sct5;
    private ServerSocketThread sct6;
    private ServerSocketThread sct7;
    private ServerSocketThread sct8;


    int currentThreadTurn;

    void serverStart(){
        try{
            ServerSocket server = new ServerSocket(port);

            switch (playerCount) {
                case TWO_PLAYERS:
                    player1 = server.accept();
                    sct1 = new ServerSocketThread(player1);
                    sct1.start();

                    player2 = server.accept();
                    sct2 = new ServerSocketThread(player2);
                    sct2.start();

                    System.out.println("Server filled");
                    break;
                case THREE_PLAYERS:
                    player1 = server.accept();
                    sct1 = new ServerSocketThread(player1);
                    sct1.start();

                    player2 = server.accept();
                    sct2 = new ServerSocketThread(player2);
                    sct2.start();

                    player3 = server.accept();
                    sct3 = new ServerSocketThread(player3);
                    sct3.start();

                    System.out.println("Server filled");
                    break;
                case FOUR_PLAYERS:
                    player1 = server.accept();
                    sct1 = new ServerSocketThread(player1);
                    sct1.start();

                    player2 = server.accept();
                    sct2 = new ServerSocketThread(player2);
                    sct2.start();

                    player3 = server.accept();
                    sct3 = new ServerSocketThread(player3);
                    sct3.start();

                    player4 = server.accept();
                    sct4 = new ServerSocketThread(player4);
                    sct4.start();

                    System.out.println("Server filled");
                    break;
                case FIVE_PLAYERS:
                    player1 = server.accept();
                    sct1 = new ServerSocketThread(player1);
                    sct1.start();

                    player2 = server.accept();
                    sct2 = new ServerSocketThread(player2);
                    sct2.start();

                    player3 = server.accept();
                    sct3 = new ServerSocketThread(player3);
                    sct3.start();

                    player4 = server.accept();
                    sct4 = new ServerSocketThread(player4);
                    sct4.start();

                    player5 = server.accept();
                    sct5 = new ServerSocketThread(player5);
                    sct5.start();

                    System.out.println("Server filled");
                    break;
                case SIX_PLAYERS:
                    player1 = server.accept();
                    sct1 = new ServerSocketThread(player1);
                    sct1.start();

                    player2 = server.accept();
                    sct2 = new ServerSocketThread(player2);
                    sct2.start();

                    player3 = server.accept();
                    sct3 = new ServerSocketThread(player3);
                    sct3.start();

                    player4 = server.accept();
                    sct4 = new ServerSocketThread(player4);
                    sct4.start();

                    player5 = server.accept();
                    sct5 = new ServerSocketThread(player5);
                    sct5.start();

                    player6 = server.accept();
                    sct6 = new ServerSocketThread(player6);
                    sct6.start();

                    System.out.println("Server filled");
                    break;
                case SEVEN_PLAYERS:
                    player1 = server.accept();
                    sct1 = new ServerSocketThread(player1);
                    sct1.start();

                    player2 = server.accept();
                    sct2 = new ServerSocketThread(player2);
                    sct2.start();

                    player3 = server.accept();
                    sct3 = new ServerSocketThread(player3);
                    sct3.start();

                    player4 = server.accept();
                    sct4 = new ServerSocketThread(player4);
                    sct4.start();

                    player5 = server.accept();
                    sct5 = new ServerSocketThread(player5);
                    sct5.start();

                    player6 = server.accept();
                    sct6 = new ServerSocketThread(player6);
                    sct6.start();

                    player7 = server.accept();
                    sct7 = new ServerSocketThread(player7);
                    sct7.start();

                    System.out.println("Server filled");
                    break;
                case EIGHT_PLAYERS:
                    player1 = server.accept();
                    sct1 = new ServerSocketThread(player1);
                    sct1.start();

                    player2 = server.accept();
                    sct2 = new ServerSocketThread(player2);
                    sct2.start();

                    player3 = server.accept();
                    sct3 = new ServerSocketThread(player3);
                    sct3.start();

                    player4 = server.accept();
                    sct4 = new ServerSocketThread(player4);
                    sct4.start();

                    player5 = server.accept();
                    sct5 = new ServerSocketThread(player5);
                    sct5.start();

                    player6 = server.accept();
                    sct6 = new ServerSocketThread(player6);
                    sct6.start();

                    player7 = server.accept();
                    sct7 = new ServerSocketThread(player7);
                    sct7.start();

                    player8 = server.accept();
                    sct8 = new ServerSocketThread(player8);
                    sct8.start();

                    System.out.println("Server filled");
                    break;
            }

        } catch (IOException e){
            System.out.println("FATAL SERVER ERROR");
        }
    }

}
