package info.liangsheng.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zhonlian on 2016/8/15.
 */
public class Server {

    final static String response =
            "HTTP/1.0 200 OK\r\n" +
            "Content-type: text/plain\r\n" +
            "Hello World\r\n";
    public static void start() throws IOException{
        ServerSocket  listener = new ServerSocket(6000);
        while(true){
            handleRequest(listener.accept());
        }

    }

    public static void handleRequest(Socket socket) throws  IOException{

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(br.readLine());

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(response.getBytes());
        }finally {
            socket.close();
        }

    }


    public static void main(String[] args) throws  IOException{
        start();
    }
}
