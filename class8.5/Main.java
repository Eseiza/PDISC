import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class Main {
    // public static void main(String[] args) throws IOException {
    // HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
    // server.createContext("/text", new MyHandler());
    // server.setExecutor(null);
    // server.start();
    // System.out.println("Servidor iniciado en Port 8000");
    // }

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/text", exchange -> {
            String path = exchange.getRequestURI().getPath();
            String[] parts = path.split("/");
            if (parts.length == 4) {
                String nombre = parts[2];
                String apellido = parts[3];
                String response = "hola " + nombre + " " + apellido;
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            } else {
                String error = "faltan paramentros";
                exchange.sendResponseHeaders(400, error.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(error.getBytes());
                os.close();
            }
        });
        server.start();
        System.out.println("Servidor iniciado en Port 8000");
    }

    // static class MyHandler implements HttpHandler {
    // @Override
    // public void handle(HttpExchange t) throws IOException {
    // String response = "Aca se ve el text";
    // t.sendResponseHeaders(200, response.length());
    // OutputStream os = t.getResponseBody();
    // os.write(response.getBytes());
    // os.close();
    // }
    // }

}
