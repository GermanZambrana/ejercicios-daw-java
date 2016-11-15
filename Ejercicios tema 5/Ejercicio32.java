package cap5;
/**
 * @author German Zambrana Ruiz
 * 
 * Ejercicio 32 del capítulo 5
 * Cuales son y cuanto suman los números pares de un número introducido por la consola
*/
public class Ejercicio32 {
	public static void main(String[] args) {
		System.out.print("Introduce un número entero positivo: ");
		long num = Long.parseLong(System.console().readLine());
		int sum = 0;
		if(num > 0) {
			System.out.print("Los números pares son: ");
			// Extract numbers from "num" var and add it to "sum" var
			while(num > 0) {
				// Check if the extracted number is pair
				// if it is, show it in the console, then add it to "sum" var
				if((num%10)%2 == 0) {
					System.out.print(num%10);
					sum += num%10;
				}
				num -= num%10;
				num /= 10;
			}
			System.out.println();
			System.out.println("La suma de los números es " + sum);
		} else {
			System.out.println("El número introducido debe ser positivo y mayor que 0.");
		}
	}
}
