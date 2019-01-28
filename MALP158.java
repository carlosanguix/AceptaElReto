import java.util.Scanner;

public class MALP158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int saltos;
		int primerSalto;
		int siguienteSalto;
		int saltoArriba;
		int saltoAbajo;
		
		for (int i = 0; i < casos; i++) {
			
			saltos = sc.nextInt();
			saltoArriba = 0;
			saltoAbajo = 0;
			
			primerSalto = sc.nextInt();
			
			for (int j = 0; j < saltos - 1; j++) {
				
				siguienteSalto = sc.nextInt();
				
				if (primerSalto < siguienteSalto) {
					
					saltoArriba++;
				} else if (primerSalto > siguienteSalto) {
					
					saltoAbajo++;
				}
				
				primerSalto = siguienteSalto;
			}
			
			if (i == casos - 1) {
				
				System.out.printf("%d %d", saltoArriba, saltoAbajo);
			} else {
				
				System.out.printf("%d %d%n", saltoArriba, saltoAbajo);
			}
		}
	}
}
