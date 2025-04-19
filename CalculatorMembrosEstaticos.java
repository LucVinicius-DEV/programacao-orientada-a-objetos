public class Calculator {
  
  public static final double PI = 3.14159;
  
  public static double circumference(double radius) {   //função para calcular a circunferência
    return 2.0 * PI * radius;
  }
  
  public static double volume(double radius) {  //função para calcular o volume
  return 4.0 * PI * radius * radius * radius / 3.0;
  }
   
}
