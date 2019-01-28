import java.util.Scanner;

public class MALP487 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		long horasRetroceder = 0;
		long vueltasAñadidas;
		long parteEntera;
		long resto;
		
		for (int i = 0; i < casos; i++) {
			
			vueltasAñadidas = 0;
			horasRetroceder = sc.nextLong();
			
			long total = horasRetroceder;
			
			while (total >= 3600) {
				
				parteEntera = total / 3600;
				resto = total % 3600;
				vueltasAñadidas += parteEntera;
				
				total = parteEntera + resto;
				
			}
			
			System.out.println(vueltasAñadidas + horasRetroceder);
			
			
			
			
			/*
			segundosRetroceder = sc.nextLong();
			
			vueltasAñadidas = segundosRetroceder / 3600;
			
			segundosRetroceder += vueltasAñadidas;
			
			if ((segundosRetroceder / 3600) > vueltasAñadidas) {
				
				segundosRetroceder += segundosRetroceder / 3600 - vueltasAñadidas;
			}
			
			System.out.println(segundosRetroceder);
			*/
		}
		
	}

}