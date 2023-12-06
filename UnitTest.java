package cr.go.ucr.test;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Daniel
 */
public class UnitTest {
    
    public UnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    //Suma
    public void testValidSuma() {
       OperacionAritmetica suma = new OperacionAritmetica( new Sumar() );
       assertNotEquals(suma.procesar(5,10), -1);
    }
    
    public void testNegSuma() {
       OperacionAritmetica suma = new OperacionAritmetica( new Sumar() );
       assertEquals(suma.procesar(-5,10), -1);
    }
    //Resta
    public void testValidResta1() {
       OperacionAritmetica resta = new OperacionAritmetica( new Resta() );
       assertNotEquals(resta.procesar(7,4), -2);
    }
    
     public void testValidResta2() {
       OperacionAritmetica resta = new OperacionAritmetica( new Resta() );
       assertNotEquals(resta.procesar(7,4), -1);
    }
    
    public void testNegResta() {
       OperacionAritmetica resta = new OperacionAritmetica( new Resta() );
       assertEquals(resta.procesar(-7,4), -1);
    }
    
    public void testNoValidResta() {
       OperacionAritmetica resta = new OperacionAritmetica( new Resta() );
       assertEquals(resta.procesar(4,7), -2);
    }
    
    //Division
    public void testValidDivision1(){
       OperacionAritmetica division = new OperacionAritmetica( new Division() );
       assertNotEquals(division.procesar(12,2), -1);
    }
    
    public void testValidDivision2(){
       OperacionAritmetica division = new OperacionAritmetica( new Division() );
       assertNotEquals(division.procesar(12,2), -3);
    }
    
    public void testNegDivision() {
       OperacionAritmetica division = new OperacionAritmetica( new Division() );
       assertEquals(division.procesar(-12,2), -1);
    }
    
    public void testNoValidDivision() {
       OperacionAritmetica division = new OperacionAritmetica( new Division() );
       assertEquals(division.procesar(6,0), -3);
    }
    
    //Multiplicacion
    public void testValidMultiplicacion() {
       OperacionAritmetica multiplicacion = new OperacionAritmetica( new Multiplicacion() );
       assertNotEquals(multiplicacion.procesar(8,6), -1);
    }
    
    public void testNegMultiplicacion() {
       OperacionAritmetica multiplicacion = new OperacionAritmetica( new Multiplicacion() );
       assertEquals(multiplicacion.procesar(-8,6), -1);
    }
}
