import java.util.Scanner;

public class P191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int compartimentos;
		int capacidadAcuarioMayor;
		int diferenciaCapacidad;
		int totalLitros;
		
		for (int i = 0; i < casos; i++) {
			
			totalLitros = 0;
			
			compartimentos = sc.nextInt();
			capacidadAcuarioMayor = sc.nextInt();
			diferenciaCapacidad = sc.nextInt();
			
			for (int j = 0; j < compartimentos; j++) {
				
				totalLitros += capacidadAcuarioMayor;
				capacidadAcuarioMayor -= diferenciaCapacidad;
			}
			
			System.out.println(totalLitros);
		}
		
		
	}

}
