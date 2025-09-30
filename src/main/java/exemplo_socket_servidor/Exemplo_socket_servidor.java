package exemplo_socket_servidor;

import java.net.*;
import java.io.*;

public class Exemplo_socket_servidor {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(4444);
            System.out.println("Aguardando cliente!");
            Socket socket = servidor.accept();
            System.out.println("Chegou o cliente :" + socket.getInetAddress().getHostAddress());
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String mensagem = "oi";
            while ((mensagem = in.readLine()) != null) {
                System.out.println(mensagem);
            }
        } catch (IOException e) {
            System.err.println("Problemas de IO");
        }
    }
}
