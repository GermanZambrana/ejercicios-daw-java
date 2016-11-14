/**
* Ejercicio14 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio14{
 public static void main(String[] args) {
    
    System.out.println(" Dame una base con su exponente y te dire su resultado:");
    System.out.println("Dame su base:");
    long base = Integer.parseInt(System.console().readLine() );
    long aux;
    aux = base;
    
    System.out.println("Dame su exponente:");
    long exponente = Integer.parseInt(System.console().readLine() );
    long contador = 1;
    
    while (contador < exponente) {
      base = base * aux;
      
      contador++;
    }
    System.out.println("Resultado: " + base);
  }
}
    
    
    
 
