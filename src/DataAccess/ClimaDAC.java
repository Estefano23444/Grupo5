package DataAccess;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import javax.imageio.stream.ImageInputStream;

import org.json.JSONArray;

public class ClimaDAC extends DataHelper {
    /**
     * 
     * @return
     * @throws IOException
     */
    public JSONArray getResultado() throws IOException {
        HttpURLConnection con = getConect(new URL("https://www.weatherapi.com/docs/weather_conditions.json"));
        con.setRequestMethod("GET");

        InputStream strm = con.getInputStream();
        byte[] arrayStream = strm.readAllBytes();

        String contentJson = "";

        for (byte b : arrayStream) {
            contentJson += (char) b;
        }
        JSONArray json = new JSONArray(contentJson);
        return json;
    }
    
}
