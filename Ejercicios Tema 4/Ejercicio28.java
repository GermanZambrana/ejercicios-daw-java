/**
* Ejercicio28 del capitulo 5
*
* @author German Zambrana Ruiz
*/
    public class Ejercicio28 {
	public static void main(String[] args) {
    		System.out.print("Introduce el número cuyo factorial quieres saber: ");
		int num;
		long fac = 1;
		for(num = Integer.parseInt(System.console().readLine()); num > 1; num--) {
			fac *= num;
		}
		System.out.println("El factorial es " + fac);
	}
}
