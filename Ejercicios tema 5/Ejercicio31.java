/**
* Ejercicio31 del capitulo 5
*
* @author German Zambrana Ruiz
*/
    public class Ejercicio31 {
	public static void main(String[] args) {
    System.out.println("Vamos a pintar una l, primero dame la altura");
    int alt1 = Integer.parseInt(System.console().readLine());
    int anchura = (alt1+1)/2;
    int i = 1;
    
    while (i <= alt1) {
      if (i != alt1) 
        System.out.println("*");
        else 
        System.out.print("* ");
        i++;
      }
      
      for (int j = 1; j<= anchura; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  
    
    
