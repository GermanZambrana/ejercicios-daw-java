/**
* Ejercicio11 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio11 {
	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		int numero = Integer.parseInt(System.console().readLine());
		for(int pronumero = 0; pronumero < 5; pronumero++) {
				System.out.println("Numero     Cuadrado     Cubo");
				System.out.printf("%-6d     %-6d       %-6d\n", numero+pronumero, (numero+pronumero)*(numero+pronumero), (numero+pronumero)*(numero+pronumero)*(numero+pronumero));
			}
		}
	}
