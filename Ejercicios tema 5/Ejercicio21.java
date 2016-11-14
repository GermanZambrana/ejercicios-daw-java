/**
* Ejercicio21 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio21 {
    public static void main(String[] args) {
    System.out.println("Introduzca números por la consola.\n" +
    "El programa parará cuando se introduzca un número negativo.");
    int n = 0; // Último número introducido
    int numCount = 0; // Total number count
    int oddNumCount = 0; // Odd number count
    int oddNumTot = 0; // Odd number count
    int hPairNum = 0;
    
    while (n>=0) {
      n = Integer.parseInt(System.console().readLine());
      if (n>=0) {
        if (n%2==0) {
          if(n > hPairNum) {
            hPairNum = n;
            }
        } else {
          
          oddNumCount++;
          oddNumTot += n;
        } 
        numCount ++;
      }
    }
    System.out.println("Se ha terminado el conteo de números.");
    System.out.println("La cantidad de números introducida es de " + numCount);
    System.out.println("La media de los números impares es de " + (oddNumTot / oddNumCount));
    System.out.println("El mayor número par introducido es " + hPairNum);
  }
}
            
    
    

  
