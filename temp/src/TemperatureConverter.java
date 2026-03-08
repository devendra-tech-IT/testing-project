public class TemperatureConverter
{
    public static double celsiusTofahrenheit(double celsius){
  return((celsius * 9 / 5) + 32);
    }
    public static double fahrenheitToCelsius(double fernheit){
        return((fernheit - 32) * 5/2);
    }
}