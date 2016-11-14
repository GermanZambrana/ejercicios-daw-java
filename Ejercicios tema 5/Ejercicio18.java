/**
* Ejercicio18 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio18{
 public static void main(String[] args) {
   System.out.println("Dame 2 números distintos y este programa los incrementa de 7 en 7");
   
   System.out.println("Dame el primer número:");
   int n1 = Integer.parseInt(System.console().readLine() );
   
   System.out.println("Dame el segundo número:");
   int n2 = Integer.parseInt(System.console().readLine() );
   
   if (n1 > (n2+7)) {
     System.out.println("Los números son:");
     for( int i = n2+7; i<n1; n1+=7) {
       System.out.println(i);
     } 
     }else if(n2 < (n1+=7)) {
       System.out.println("Los números son:");
     for ( int i= n1+7; i<n2; n2+=7) {
       System.out.println(i);
     } 
     }else{
       System.out.println("Los números introducidos tienen que distar 8 unidades");
     }
   }
 }

      
        
   
   
   
