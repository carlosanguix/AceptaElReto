import java.util.Scanner;

public class MALP148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int horas;
		int minutos;
		String linea;
		int total;

		while (sc.hasNext()) {

			linea = sc.nextLine();

			horas = Integer.parseInt(linea.substring(0, 2));
			minutos = Integer.parseInt(linea.substring(3, 5));

			if (minutos != 0)
			{
				horas = 23 - horas;
			}
			else
			{
				horas = 24 - horas;
			}

			total = (horas * 60) + (60 - minutos);
			
			if (horas == 24 && minutos == 0)
			{
				
			} else 
			{
				System.out.println(total);
			}
		}
	}
}
