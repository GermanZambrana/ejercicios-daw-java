/**
* Ejercicio29 del capitulo 5
*
* @author German Zambrana Ruiz
*/
    public class Ejercicio29 {
	public static void main(String[] args) {
    		System.out.print("Introduce el dividendo tope: ");
		int numMax = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce el divisor: ");
		int div = Integer.parseInt(System.console().readLine());
		for(int i = 1; i <= numMax; i++) {
			if(!(i % div == 0)) {
				System.out.println(i);
			}
		}
	}
}
