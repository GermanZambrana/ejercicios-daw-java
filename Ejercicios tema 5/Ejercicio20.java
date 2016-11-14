/**
* Ejercicio20 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.print("Dibujar pirámide hueca en la pantalla.\nIntroduce la altura de la pirámide: ");
        int h = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el caracter con el que se pintará la pirámide: ");
        String c = System.console().readLine();
        int a = 1;
        int i = 0;
        int e = h-1;
        while (a <= h) {
            if(a == 1) {
                for (i = 1; i <= e - 1 + 1; i++) {
                    System.out.print(" ");
                }
                System.out.print(c);
            } else if(a == h) {
                for (i = 1; i < a * 2 - 1; i++) {
                  System.out.print(c);
                }
            } else {
                for (i = 1; i <= e; i++) {
                    System.out.print(" ");
                }
                System.out.print(c);
                for (i = 1; i < a * 2 - 3; i++) {
                  System.out.print(" ");
                }
                System.out.print(c);
            }
            System.out.println();
            a++;
            e--;
        }
    }
}
 
