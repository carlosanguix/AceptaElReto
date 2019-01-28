import java.util.Scanner;

public class P368 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int cantHuevos;
		int capOlla;
		int cont;
		
		cantHuevos = teclado.nextInt();
		capOlla = teclado.nextInt();
		
		while (cantHuevos != 0 && capOlla != 0)  {
			
			cont = 10;
			
			while (cantHuevos > capOlla) {
				
				cantHuevos = cantHuevos - capOlla;
				cont = cont + 10;
				
			}
			
			System.out.println(cont);
			
			cantHuevos = teclado.nextInt();
			capOlla = teclado.nextInt();
			
		}
		
		
		
		
		
	}

}
