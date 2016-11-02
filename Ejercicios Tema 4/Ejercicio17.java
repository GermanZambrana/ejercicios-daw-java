/**
* Ejercicio17 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio17{
 public static void main(String[] args) {
	 System.out.println("Dime un número y te digo su 2º cifra");
     int r;		
	 int n = Integer.parseInt(System.console().readLine());
	r = n % 10;
	{ 
	 System.out.println("El segundo numero es el: " + r);
 }
}
}


