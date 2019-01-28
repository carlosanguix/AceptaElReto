import java.util.Scanner;

public class P427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int casos;
		String personaje;
		String parentesco;
		
		casos = teclado.nextInt();
		teclado.nextLine();
		while (casos > 0) {
			
			personaje = teclado.nextLine();
			parentesco = teclado.nextLine();
			
			if (personaje.equals("Luke") && parentesco.equals("padre")) {
				
				System.out.println("TOP SECRET");
				
			} else {
				
				System.out.printf("%s, yo soy tu %s%n", personaje, parentesco);
				
			}
			
			
			casos--;
		}
		
		
		
	}

}
