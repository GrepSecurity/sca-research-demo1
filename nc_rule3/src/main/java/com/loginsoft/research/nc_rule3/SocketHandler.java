package com.loginsoft.research.nc_rule3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketHandler {

    public void sendData(String host, int port, String data) throws IOException {
        Socket socket = new Socket(host, port); // Non-compliant: not closed
        OutputStream out = socket.getOutputStream();
        out.write(data.getBytes());
        out.flush();
        // socket.close() missing
    }
    public void sendDataWithSafeFinally(String host, int port, String data) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket(host, port);
            OutputStream output = socket.getOutputStream();
            output.write(data.getBytes());
        } catch (IOException e) {
            throw e;
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.err.println("Warning: socket close failed: " + e.getMessage());
                }
            }
        }
    }

}
