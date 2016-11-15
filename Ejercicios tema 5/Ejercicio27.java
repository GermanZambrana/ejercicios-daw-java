/**
* Ejercicio27 del capitulo 5
*
* @author German Zambrana Ruiz
*/
    public class Ejercicio27 {
	public static void main(String[] args) {
    System.out.println("Sumatorio de los multiplos de 3 entre 1 y el número introducido por teclado");
    System.out.println("Introduce el número");
    int mult = Integer.parseInt(System.console().readLine());
    int sum = 0;
    
    for(int i = 1; i< mult; i++) {
      System.out.println("3 *" + i + " = " + 3*i);
      sum += 3*i;
    }
    System.out.println("La suma es = " + sum);
  }
}

