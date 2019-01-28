import java.util.Scanner;

public class P149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int numToros;
		int velocidadToro = 0;
		int maxVel = 0;
		
		while (teclado.hasNext()) {
			
			numToros = teclado.nextInt();
			maxVel = 0;
			
			for (int i = 0; i < numToros; i++) {
				
				velocidadToro = teclado.nextInt();
				
				if (velocidadToro > maxVel) {
					
					maxVel = velocidadToro;
					
				}
				
			}
			
			System.out.println(maxVel);
			
		}
		
		
		
	}

}
