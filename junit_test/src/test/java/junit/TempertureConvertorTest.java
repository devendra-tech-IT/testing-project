package junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TempertureConvertorTest {

    @Test 
    void testcelsiusTofahrenheit() {
        TemperatureConverter tem = new TemperatureConverter();
       
        assertEquals(212.0, tem.celsiusTofahrenheit(100.0));
        System.out.println();
    }
    @Test 
    void testfahrenheitToCelsius() {
        TemperatureConverter tem = new TemperatureConverter();
        
        assertEquals(100.0, tem.fahrenheitToCelsius(212.0));
    }
     @Test 
    void testCelsiusTOKelvin() {
        TemperatureConverter tem = new TemperatureConverter();
        
        assertEquals(485.0, tem.CelsiusTOKelvin(212.0));
    }
}