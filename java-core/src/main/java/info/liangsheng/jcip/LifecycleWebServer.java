package info.liangsheng.jcip;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhonlian on 2016/8/12.
 */
public class LifecycleWebServer {
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void start() throws IOException{
        ServerSocket serverSocket = new ServerSocket(8888);
        while (!executorService.isShutdown()){
            final Socket socket = serverSocket.accept();
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    handleRequest();
                }
            });
        }

    }

    public void stop(){
        executorService.shutdown();
    }
    void handleRequest(){
        System.out.println("handling");
    }

    public static void main(String[] args)throws  Exception{
        LifecycleWebServer server = new LifecycleWebServer();
        server.start();
    }
}
