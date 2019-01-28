import java.util.Scanner;

public class MALP484 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String numeroInicial;
		String numeroPrueba = "";
		int izq;
		int der;
		
		while (sc.hasNext()) {
			
			numeroInicial = sc.nextLine();
			
			for (int i = 0; i < numeroInicial.length(); i++) {
				
				if (numeroInicial.charAt(i) != '0') {
					
					izq = i;
					break;
				}
				
			}
			
			
		}
		
		
		
	}

}
