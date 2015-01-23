package jp.gomasy.mchook;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;

public class MultiHookServer extends Thread {
    public static final int PORT = 29653;

    @Override
    public void run() {
        ServerSocket server = null;

        try {
            server = new ServerSocket(PORT);
            while (true) {
                socketOpen(server);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                socketClose(server);
            }
        }
    }

    public void socketOpen(ServerSocket server) throws IOException {
        new HookServer(server.accept()).start();
    }

    public void socketClose(ServerSocket server) {
        try {
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
