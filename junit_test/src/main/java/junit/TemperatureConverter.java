package junit;


public class TemperatureConverter
{

     static double celsiusTofahrenheit(double celsius){
  return  ((celsius * 9 / 5) + 32.0);
    }
    public static double fahrenheitToCelsius(double fernheit){
        return((fernheit - 32) * 5/9);
    }
    public static double CelsiusTOKelvin(double celsius){
        return((celsius + 273) );
    }

} 

