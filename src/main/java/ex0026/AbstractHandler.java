package ex0026;

import java.net.Socket;
import java.net.SocketAddress;

public abstract class AbstractHandler implements Runnable{
    private Socket socketClient;

    public void handle(Socket socket){
        this.socketClient = socket;
    }

    @Override
    public void run() {
        SocketAddress address = socketClient.getRemoteSocketAddress();
        System.out.println("Verbindung zu" + address + "hergestellt");

        try {
            runTask(socketClient);
        }
        catch (Exception ex){
            System.err.println(ex);
        }

    }
    protected abstract void runTask(Socket socketClient);
}
