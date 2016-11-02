/**
* Ejercicio16 del capitulo 4
*
* @author German Zambrana Ruiz
*/
public class Ejercicio16{
 public static void main(String[] args) {
	 System.out.println("Test para saber si tu pareja te esta siendo infiel(Siendo V verdadero y F falso");
	 
   String respuesta;
	 int puntuacion = 0;
	 System.out.println("1.¿Sale a menudo de casa?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 

  	 System.out.println("2.¿Te dice que te quiere a diario?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 
		
	 System.out.println("3.¿Os peleais a menudo?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 	
		
     System.out.println("4.¿Te habla de otras personas?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 
		
		 System.out.println("5.¿Huele a otra persona?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 
		
		 System.out.println("6.¿No te deja mirar su movil?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 
		
		 System.out.println("7.¿Ultimamente está alejada de ti?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 
		
			 System.out.println("8.¿Te faltan condones?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 
		
			 System.out.println("9.¿Habla contigo poco?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 
		
			 System.out.println("10.¿Se arregla mucho siempre que sale?");
	 System.out.println("(V/F)");
	 respuesta = System.console().readLine();
	 if(respuesta.equals("V")){
		 
		puntuacion = puntuacion + 3;} 
 
	if (puntuacion <= 5) {
	  	System.out.println("Lo siento su pareja es infiel :C");
	  	}
	  	
	if (puntuacion >= 6) {
		System.out.println("Enhorabuena, su pareja es fiel :)");
	}
 }
}  	
	  	
	  	
	  	
	  	
	  	
	  	
	  	
		
