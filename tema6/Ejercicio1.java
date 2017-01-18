/*
*
* @author German Zambrana T6 Ej1
*
*/


public class Ejercicio1 {
  public static void main(String[] args) { 
    System.out.println("Vamos a tirar 3 dados de 6 caras y posteriormente");
    System.out.println("vamos a sumar el número total de puntos obtenidos.");
    System.out.println("______________________________________________");
    
    int dado = 0;
    int suma = 0;
    
    for (int i = 1; i <= 3; i++) {
      System.out.println("\nPulse intro para tirar el dado.");
      System.console().readLine();
      dado = (int)(Math.random()*6) + 1;
      System.out.println(dado);
      suma += dado;
    }
    
    System.out.println("La suma de las tres tiradas es: " + suma);
    
  }
}
