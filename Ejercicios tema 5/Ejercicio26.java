/**
* Ejercicio26 del capitulo 5
*
* @author German Zambrana Ruiz
*/
    public class Ejercicio26 {
	public static void main(String[] args) {
		System.out.print("Introduce un número, y tras él, que esté en ese número para saber su posición: ");
		int num = Integer.parseInt(System.console().readLine());
		int digit   = Integer.parseInt(System.console().readLine());
		int pos     = 1;
		int backNum = 0;
		if(num > 0) {
			do {
				backNum += (num%10);
				num = num / 10;
				if(num > 0) {
					backNum = backNum * 10;
				}
			} while(num > 0);
			if(num > 0) {
				System.out.println("La posición introducida supera el número de dígitos.\n");
			} else {
				// Successfuly executed program
				while(backNum > 0) {
					if((backNum % 10) == digit) {
						System.out.println("El dígito " + digit + " aparece en la posición " + pos);
					}
					backNum /= 10;
					pos++;
				}
			}
		} else {
			// Can't execute program because the introduced number is lower than zero
			System.out.println("Cero no es compatible con este programa.");
		}
	}
}
