/**
* Ejercicio16 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio16{
 public static void main(String[] args) {
   System.out.println("Dime un número y te diré si es primo o no");
   int n = Integer.parseInt(System.console().readLine() );
   
   int contador = 1;
   int contadorDivisionesExactas = 0;
    
    while (contador <= n) {
      
      int resto = n % contador;
      if (resto == 0) {
        contadorDivisionesExactas++;
        System.out.println(contador + " ");
      } 
      contador++;
    }
    
    if (contadorDivisionesExactas <= 2) {
      System.out.print("El número es primo");
     } else {
        System.out.print("El número no es primo (arriba se muestran los números por los que se puede dividir)");
      }
  }
}
   
