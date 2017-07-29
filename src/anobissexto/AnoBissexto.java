
package anobissexto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AnAnne Gonçalo
 */
public class AnoBissexto {

    public static void main(String[] args) {
        
    }
    
    public static boolean EhBissexto(int ano){
        try{
            if(ano < 0)
                throw new Exception("Ano deve ser positivo");
        }
        catch(Exception e){
            
        }
        if(ano % 400 == 0)
            return true;
        else if((ano % 4 == 0) && !(ano % 100 == 0))
            return true;
        
        return false;
    }
}
