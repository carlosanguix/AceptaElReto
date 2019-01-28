import java.util.Scanner;

public class P117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * La fiesta aburrida
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		
		int casos = teclado.nextInt();		
				
		for (int i = 0; i < casos; i++) {
			
			String soy = teclado.next();
			String nombre = teclado.next();
			System.out.println("Hola, " + nombre + ".");

			
		}
		
	}

}
