/**
* Ejercicio19 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio19{
 public static void main(String[] args) {
   System.out.println("Vamos a hacer una pirámide");
   System.out.println("Primero dame la altura");
   int alturaint = Integer.parseInt(System.console().readLine() );
   
   System.out.println("Ahora dime el carácter con el que quieres que la dibuje:");
   String caracter = System.console().readLine();
   
   int altura = 1;
   int i = 0;
   int espacios = altura-1;
   
   while(altura <= alturaint) {
     for(i = 1; i <= espacios; i++) {
       System.out.print (" ");
     }
     
     for( i = 1; i < altura * 2; i++) {
       System.out.print(caracter);
     }
     
     System.out.println();
     
     altura++;
     espacios--;
   }
 }
}
  
   
   
