import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class RequestHTTP {

    void requestConnection() throws IOException {

        URL randomUser = new URL("https://randomuser.me/api/?results=30");
        URLConnection randomUserConnection = randomUser.openConnection();
        BufferedReader randomUserReader = new BufferedReader(
                new InputStreamReader(
                        randomUserConnection.getInputStream()));
        String inputLine;

        while ((inputLine = randomUserReader.readLine()) != null)
            System.out.println(inputLine);
        randomUserReader.close();
    }


}
