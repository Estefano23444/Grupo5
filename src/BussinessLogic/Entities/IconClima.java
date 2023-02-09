package BussinessLogic.Entities;
public class IconClima {
    
    Integer code;
    String  day;
    String  night;
    Integer icon;
    /**
     * 
     * @param code
     * @param day
     * @param night
     * @param icon
     */
    public IconClima(Integer code, String day, String night, Integer icon) {
        this.code = code;
        this.day = day;
        this.night = night;
        this.icon = icon;
    }
    /**
     * 
     * @return
     */
    public Integer getCode() {
        return code;
    }
    /**
     * 
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }
    /**
     * 
     * @return
     */
    public String getDay() {
        return day;
    }
    /**
     * 
     * @param day
     */
    public void setDay(String day) {
        this.day = day;
    }
    /**
     * 
     * @return
     */
    public String getNight() {
        return night;
    }
    /**
     * 
     * @param night
     */
    public void setNight(String night) {
        this.night = night;
    }
    /**
     * 
     * @return
     */
    public Integer getIcon() {
        return icon;
    }
    /**
     * 
     * @param icon
     */
    public void setIcon(Integer icon) {
        this.icon = icon;
    }

}
