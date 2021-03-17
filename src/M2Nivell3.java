
public class M2Nivell3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


// RELLOTGE DIGITAL ------------------------------------------------------
		
		int hour = 23;
		int minutes = 59;
		int seconds = 56;
		
		while (true) {
			
			// Mostra en consola els digits del rellotge
			
			if (hour<10) {
				System.out.print("0");  // posa un zero quan el numero es menor que 10, tema disseny
			}
			
			System.out.print(hour+":");  
			
			if (minutes<10) {
				System.out.print("0");   // posa un zero quan el numero es menor que 10, tema disseny
			}
			System.out.print(minutes+":");
			
			if (seconds<10) {          
				System.out.print("0");   // posa un zero quan el numero es menor que 10, tema disseny
			}
			System.out.println(seconds);
			
		
			// Calcul per incrementar el temps per segons, minuts i hores
			
			seconds++;
				
			// Comprova el temps i calcula que passa quan passem de 60 segons, de 60 minuts i de 24 hores
				
			if (seconds == 60) {
				seconds = 0;
				minutes ++;
				
				if (minutes == 60) {
					minutes = 0;
					hour++;
					
					if (hour == 24) {
						hour = 0;									
					}					
				}				
			}	
			
			Thread.sleep(1000);	
		}
	}
}
