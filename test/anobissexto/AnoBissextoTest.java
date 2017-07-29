
package anobissexto;

import junit.framework.TestCase;

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
    
    public void testAnoNaoPositivo(){
            AnoBissexto.EhBissexto(-1);  
            fail("Ano deve ser positivo");
    }
    
}
