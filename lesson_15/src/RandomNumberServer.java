import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.Random;

public class RandomNumberServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(66), 0);
        server.createContext("/random", new RandomNumberHandler());
        server.start();
        System.out.println("Server started on port 66...");
    }
}

class RandomNumberHandler implements HttpHandler {
    private static final String STUDENT_INFO = "Генератор случайных чисел\n" +
            "Студент: Дрожжин Александр Александрович, Шифр: 23И0049";

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        Map<String, String> queryParams = parseQuery(query);

        String minStr = queryParams.get("min");
        String maxStr = queryParams.get("max");

        if (minStr == null || maxStr == null) {
            sendResponse(exchange, STUDENT_INFO + "\nОшибка: отсутствуют параметры 'min' или 'max'", 400);
            return;
        }
        try {
            int min = Integer.parseInt(minStr);
            int max = Integer.parseInt(maxStr);

            if (min > max) {
                sendResponse(exchange, STUDENT_INFO + "\nОшибка: 'min' не может быть больше 'max'", 400);
                return;
            }

            Random random = new Random();
            int randomNumber = random.nextInt(max - min + 1) + min;

            sendResponse(exchange, STUDENT_INFO + "\nСлучайное число: " + randomNumber, 200);
        } catch (NumberFormatException e) {
            sendResponse(exchange, STUDENT_INFO + "\nОшибка: 'min' и 'max' должны быть целыми числами", 400);
        }
    }

    private void sendResponse(HttpExchange exchange, String message, int statusCode) throws IOException {
        byte[] response = message.getBytes("UTF-8");
        exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=UTF-8");
        exchange.sendResponseHeaders(statusCode, response.length);
        OutputStream os = exchange.getResponseBody();
        os.write(response);
        os.close();
    }


    private Map<String, String> parseQuery(String query) {
        if (query == null) {
            return Map.of();
        }
        String[] pairs = query.split("&");
        Map<String, String> result = new java.util.HashMap<>();
        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            if (keyValue.length == 2) {
                result.put(keyValue[0], keyValue[1]);
            }
        }
        return result;
    }
}
