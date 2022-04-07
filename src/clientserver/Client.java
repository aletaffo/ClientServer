package clientserver;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hp
 */
public class Client {
        public static void main (String[] args){
            try {
                Socket socket = new Socket("127.0.0.1",2000);
                //Apro un socket specificando l'indirizzo IP e il numero di porta del server.
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
