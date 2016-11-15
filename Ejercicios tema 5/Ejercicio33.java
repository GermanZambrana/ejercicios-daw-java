/**
* Ejercicio33 del capitulo 5
*
* @author German Zambrana Ruiz
*/
    public class Ejercicio33 {
	public static void main(String[] args) {
    System.out.println("Vamos a dibujar una u con asteriscos, primero dame la altura");
    int altura = Integer.parseInt(System.console().readLine());
    int anchura = (altura+1)/2;
    
    for (int i = 1; i <= altura; i++) { 
      System.out.println("*");
    }
    for (int b =(altura - 2); b <= anchura; anchura++) {
      System.out.print("*");
    }
  }
}

