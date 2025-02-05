package co.edu.eci.arep;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.net.Socket;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

public class HttpServerTest {

    @Test
    public void testHelloEndpoint() throws IOException {
        HttpServer.get("/App/hello", (req, resp) -> "Hello " + req.getValues("name"));
        String response = sendRequest("GET /App/hello?name=John HTTP/1.1");
        assertTrue(response.contains("Hello John"));
    }

    @Test
    public void testPiEndpoint() throws IOException {
        HttpServer.get("/App/pi", (req, resp) -> String.valueOf(Math.PI));
        String response = sendRequest("GET /App/pi HTTP/1.1");
        assertTrue(response.contains("3.14159"));
    }

    @Test
    public void testNotFoundFile() throws IOException {
        String response = sendRequest("GET /nonexistent.txt HTTP/1.1");
        assertTrue(response.contains("404 Not Found"));
    }

    @Test
    public void testInvalidRoute() throws IOException {
        String response = sendRequest("GET /invalid HTTP/1.1");
        assertTrue(response.contains("404 Not Found"));
    }

    private String sendRequest(String request) throws IOException {
        try (Socket socket = new Socket("localhost", 30000);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            out.println(request);
            out.println();
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line).append("\n");
            }
            return response.toString();
        }
    }
}
