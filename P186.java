import java.util.Scanner;

public class P186 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int[][] matriz;

		int equipos;
		int globosEntregados;
		int globoEquipo = 0;
		int mayor = 0;
		int ganador = 0;
		String color = "";
		
		equipos = 4;
		globosEntregados = 7;

		while (equipos != 0) {
			
			matriz = new int[2][equipos + 1];
			
			for (int i = 1; i <= globosEntregados; i++) {

				globoEquipo = teclado.nextInt();
				teclado.nextLine();
				color = teclado.nextLine();

				matriz[1][globoEquipo] = matriz[1][globoEquipo] + 1;

			}
			
			
			for (int i = 1; i <= globosEntregados;i++) {
				
				if (matriz[1][i] > mayor) {
					ganador = i;
					mayor = matriz[1][i];
				}
			}
			
			for (int i = 1; i <= globosEntregados; i++) {
				
				if (ganador == matriz[1][i]) {
					
					ganador = 0;
				}
			}
			
			if (ganador > 0) {
				System.out.println(ganador);
			} else {
				System.out.println("EMPATE");
			}
			
			mayor = 0;
			equipos = teclado.nextInt();
			globosEntregados = teclado.nextInt();
			
		}



	}

}
