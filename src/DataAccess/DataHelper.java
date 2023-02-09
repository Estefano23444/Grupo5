package DataAccess;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public abstract class DataHelper {
    /**
     * 
     * @param url
     * @return
     */
    protected static HttpURLConnection getConect(URL url){
        try {
            HttpURLConnection con;
            con = (HttpURLConnection) url.openConnection();
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
