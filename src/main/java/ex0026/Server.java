package ex0026;

import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        final int port = 5000;
        TCPServer server = new TCPServer(port, new CalculatorHandler());

        server.startServer();
        System.out.println("Started");
        System.in.read();
        System.out.println("Enter stoppt");
        server.stopServer();
        System.out.println("Stopped");

    }
}