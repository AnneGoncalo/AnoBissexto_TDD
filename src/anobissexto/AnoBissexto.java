
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

    static boolean EhBissexto(int ano) {
        return (ano >= 0 && (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0));
    }
    
    
}
