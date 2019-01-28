import java.util.Scanner;

public class P371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int triangulos;
		int palillos;
		int cont = 0;

		triangulos = teclado.nextInt();

		while (triangulos != 0 && triangulos < 20000) {

			cont = 0;
			palillos = 0;
			
			do {
				
				triangulos = triangulos - 1;
				cont = cont + 3; 
				palillos = palillos + cont;
				
			} while (triangulos > 0);





			System.out.println(palillos);

			triangulos = teclado.nextInt();
		} 



	}

}
