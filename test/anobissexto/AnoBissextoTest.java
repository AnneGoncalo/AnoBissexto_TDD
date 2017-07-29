
package anobissexto;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author AnAnne Gonçalo
 */
public class AnoBissextoTest extends TestCase{
    
    public void testAnoPositivoDivisivelPor400(){
        assertEquals(AnoBissexto.EhBissexto(1600), true);  
    }
    
    public void testAnoPositivoDivisivelPor4eNao100(){
        assertEquals(AnoBissexto.EhBissexto(1732), true);  
    }
    
    @Test(expected = Exception.class)
    public void testAnoNaoPositivo(){
        AnoBissexto.EhBissexto(-1);
    }
    
    public void testAnoNaoDivisivelPor4(){
        assertEquals(AnoBissexto.EhBissexto(2011), false);
    }
    
}
