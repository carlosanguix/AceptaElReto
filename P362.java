import java.util.Scanner;

public class P362 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int casos;
		int dia;
		int mes;
		
		
		casos = teclado.nextInt();
		
		while (casos != 0) {
			
			dia = teclado.nextInt();
			mes = teclado.nextInt();
			
			if (dia == 25 && mes == 12) {
				
				System.out.println("SI");
				
			} else {
				
				System.out.println("NO");
				
			}
			
			casos--;
			
		}
		
		
		
		
		
		
		
	}

}
