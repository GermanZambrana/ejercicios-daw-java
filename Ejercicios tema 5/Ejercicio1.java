/**
* Ejercicio1 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio1{
 public static void main(String[] args) {
        System.out.println("Múltiplos de 5 con el bucle for:");
        int m = 1;
        int r = 0;
        for(int i = 5; r < 100; m++) {
            r = i*m;
            System.out.println(i + " * " + m + " = " + r);
        }
    }
}
