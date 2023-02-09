package BussinessLogic;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import BussinessLogic.Entities.IconClima;
import DataAccess.ClimaDAC;

public class IconClimaBL {
    /**
     * 
     * @return
     * @throws IOException
     */
    public ArrayList<IconClima> getIcon() throws IOException{
        try {
            ArrayList<IconClima> lstIcons = new ArrayList<IconClima>();
            ClimaDAC climaDAC = new ClimaDAC();
            JSONArray res = climaDAC.getResultado();
            for (Object object : res) {
                IconClima icon = new IconClima(Integer.parseInt(((JSONObject) object).get("code").toString()), ((JSONObject) object).get("day").toString(), ((JSONObject) object).get("night").toString(), Integer.parseInt(((JSONObject) object).get("icon").toString()));
                lstIcons.add(icon);
        }
        return lstIcons;
        } catch (Exception e) {
            
        }
        return null;
    }
}
