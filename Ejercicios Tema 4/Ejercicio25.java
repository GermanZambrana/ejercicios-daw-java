/**
* Ejercicio25 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio25 {
	public static void main(String[] args) {
		System.out.print("Introduce un número para verlo al revés: ");
		int num = Integer.parseInt(System.console().readLine());
		int backNum = 0;
		if(num > 0) {

			do {

				backNum += (num%10); 
				num = num / 10; 
				if(num > 0) {
					backNum = backNum * 10;
				}
			
			} while(num > 0);
			System.out.println("El número del revés es " + backNum);
		} else {

			System.out.println("No se puede volver del revés un número igual o menor que cero");
		}
	}
}
