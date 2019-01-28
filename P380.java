import java.util.Scanner;

public class P380 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int casos;
		int gastos;
		int totalGastos;
		
		casos = teclado.nextInt();
		
		while (casos != 0) {
			
			gastos = 0;
			totalGastos = 0;
			
			for (int i = 0; i < casos; i++) {
				
				gastos = teclado.nextInt();
				totalGastos = totalGastos + gastos;
				
			}
			
			System.out.println(totalGastos);
			casos = teclado.nextInt();
		}
		
		
		
		
		
		
		
		
	}

}
