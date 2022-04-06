package clientserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Server {
    public static void main (String[] args){
        try {
            //1)apertura porta, avvio del servizio
            ServerSocket serverSocket=new ServerSocket(2000);
            //Creare un’istanza DOVE specificando il numero di porta su cui rimanere in ascolto.
            System.out.println("Server avviato correttamente nella porta 2000");
            //2)attesa richiesta client
            Socket socket=serverSocket.accept();
            //Il server rimanga in ascolto di una richiesta di connessione (la porta non deve essere già in uso)
            System.out.println("Connessione avvenuta");
            System.out.println("Socket:" + socket);
        } catch (IOException ex) {
            System.out.println("errore avvio server nella porta 2000");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
