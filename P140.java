import java.util.Scanner;

public class P140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int suma = 0;
		int operando;
		
		
		numero = teclado.nextInt();
		
		while (numero >= 0) {
			
			suma = 0;
			
			while (numero / 10 > 0) {

				operando = numero % 10;

				numero = numero / 10;

				suma = suma + operando;

				System.out.printf("%d", operando);
				
				if (numero / 10 > 0) {
					
					System.out.printf(" + ");
					
				}
				
			}
			
			suma = suma + numero;

			if (suma > 10) {
				
				System.out.printf(" + ");
				
			}
			
			System.out.printf("%d = %d%n",numero , suma);
			
			numero = teclado.nextInt();
			
		}
		
		
		
		
	}

}
