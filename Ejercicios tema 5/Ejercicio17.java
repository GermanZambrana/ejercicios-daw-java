/**
* Ejercicio17 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio17{
 public static void main(String[] args) {
   System.out.println("Dime un número y te dire la suma de los 100 siguientes:");
   
   int numero = Integer.parseInt(System.console().readLine() );
   int aux = numero;
   
   int contador = numero + 1;
   
   if (numero > 0) {
     while (contador < (100 + aux)) {
       numero += contador;
       contador++ ;
     }
     System.out.println("El resultado de los 100 numeros siguientes son: " + numero);
   }else{
     System.out.println("El número introducido es negativo");
   }
 }
}

