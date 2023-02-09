import java.security.CodeSigner;

import BussinessLogic.*;
import BussinessLogic.Entities.IconClima;

public class App {
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        IconClimaBL iconos = new IconClimaBL();
        try {
            for(IconClima i : iconos.getIcon()){
                System.out.println("--------------------------------------------------------");
                System.out.println(" Code:\t"    + i.getCode()  );
                System.out.println(" Day:\t"     + i.getDay()   );
                System.out.println(" Night:\t"   + i.getNight() );
                System.out.println(" Icon:\t"    + i.getIcon()  );
                System.out.println("--------------------------------------------------------");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
