/**
* Ejercicio24 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio24 {
	public static void main(String[] args) {
		System.out.println("Pirámide de números combiantorios.");
		System.out.print("Introduce la altura de la pirámide: ");
		// Variable declaration
		int pHeight = Integer.parseInt(System.console().readLine());
		int cHeight = 1;
		int i = 0; // Iterator
		int spaces = pHeight - 1;
		// While loop
		while(cHeight <= pHeight) {
			// Spacing
			for(i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			// Print numbers
			for(i = 1; i < cHeight; i++) {
				System.out.print(i);
			}
			for(i = cHeight; i > 0; i--) {
				System.out.print(i);
			}
			System.out.println();
			cHeight++;
			spaces--;
		}
	}
}
