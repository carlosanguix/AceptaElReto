import java.util.Scanner;

public class P217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int numPortal;
		
		
		numPortal = teclado.nextInt();
		
		while (numPortal != 0) {
			
			if (numPortal % 2 == 0) {
				
				System.out.println("DERECHA");
				
			} else {
				
				System.out.println("IZQUIERDA");
				
			}
			
			numPortal = teclado.nextInt();
			
		}
		
		
		
		
		
		
	}

}
