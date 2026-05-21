package http;

import com.sun.net.httpserver.HttpServer;

import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ContaHttp {
    public ContaHttp(String resposta, HttpServer server) throws Exception{
            server.createContext("/api/contas", exchange -> {
            exchange.sendResponseHeaders(200, resposta.length());

            OutputStream os = exchange.getResponseBody();
            os.write(resposta.getBytes());
            os.close();
        });
    }
}