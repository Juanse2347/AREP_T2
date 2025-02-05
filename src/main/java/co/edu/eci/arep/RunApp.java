package co.edu.eci.arep;

public class RunApp {
    public static void main(String[] args) throws Exception {
        HttpServer.staticfiles("/webroot");
        HttpServer.get("/hello", (req, resp) -> "Hello " + req.getValues("name"));
        HttpServer.get("/pi", (req, resp) -> String.valueOf(Math.PI));
        HttpServer.start(new String[0]);
    }
}

