/**
 * Ejercicio 21 tema 4
 *
 * @author Germán Zambrana Ruiz
 */
public class Ejercicio21 {

  public static void main(String[] args) {
    System.out.println("Dame las notas de tus examenes para calcular la media del trimestre: ");
    double e1 = Double.parseDouble(System.console().readLine());
    double e2 = Double.parseDouble(System.console().readLine());
    double media = (e1*0.4) + (e2*0.6);
    System.out.println("Tu media del trimestre es un " + media);
   
    if (media <5) {
      System.out.println("Lo siento, has suspendido,tienes que hacer un examen de recuperación");
      System.out.println("Dame la nota del examen de recuperación que hiciste");
    double rec = Double.parseDouble(System.console().readLine());
    if (rec >=5)  {
	  System.out.println("Enhorabuena, el examen de recuperación es apto, has salvado el trimestre");
	}
	if (rec <5)   {
	  System.out.println("Lo siento, has vuelto a suspender");
	 }
    } else {
      System.out.println("Enhorabuena, has aprobado el trimestre");
    }
      
  }
}
    
