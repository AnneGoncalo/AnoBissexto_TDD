
package anobissexto;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author AnAnne Gonçalo
 */
public class AnoBissextoTest extends TestCase{
    
    public void testAnoPositivoDivisivelPor4eNaoPor100(){
        assertEquals(AnoBissexto.EhBissexto(1732), true);  
    }
    
    public void testAnoNaoDivisivelPor4(){
        assertEquals(AnoBissexto.EhBissexto(2011), false);
    }
    
    public void testAnoPositivoDivisivelPor4ePor100eNaoPor400(){
        assertEquals(AnoBissexto.EhBissexto(200), false);  
    }
    
    public void testAnoPositivoDivisivelPor400(){
        assertEquals(AnoBissexto.EhBissexto(1600), true);  
    }
    
    public void testAnoNaoPositivo(){
        assertEquals(AnoBissexto.EhBissexto(-1732), false);
    }
}
