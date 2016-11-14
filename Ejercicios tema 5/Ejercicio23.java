/**
* Ejercicio22 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio23 {
	public static void main(String[] args) {
		System.out.println("Introduce números hasta que su sumatorio supere los 10000.");
		int total = 0;
		int numCount = 0;
		do {
			total += Integer.parseInt(System.console().readLine());
			numCount ++;
    } while(total < 10000);
		System.out.println("Se ha terminado de introducir números.");
		System.out.println("Total de números introducidos: " + numCount);
		System.out.println("Total acumulado: " + total);
		System.out.println("Media: " + (total / numCount ));
	}
}
