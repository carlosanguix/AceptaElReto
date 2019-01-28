import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MALP483 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		sc.nextLine();

		long seconds = 0;
		int totalCampanadas = 0;
		int campanadaDeInteres = 0;
		long milisegundosDeDiferencia = 0;
		String entrada = "";
		
		for (int i = 0; i < casos; i++) {
			
			entrada = sc.nextLine();
			totalCampanadas = sc.nextInt();
			campanadaDeInteres = sc.nextInt();
			sc.nextLine();
			
			String[] values = entrada.split(" ");
		
			
			
			Date firstDate = new SimpleDateFormat("HH:mm:ss").parse(values[0]);
			Date secondDate = new SimpleDateFormat("HH:mm:ss").parse(values[1]);
			
			long secs = secondDate.getTime() - firstDate.getTime();
			
			if(secs < 0)
			{
				secondDate.setTime(secondDate.getTime() + (24 * 3600 * 1000));
				secs = secondDate.getTime() - firstDate.getTime();
			}
			
			milisegundosDeDiferencia = Math.abs(secs);
			long segundosDiferencia = milisegundosDeDiferencia/1000;
			
			double interval = (double)segundosDiferencia/totalCampanadas;
			long intervalo = Math.round(interval);
			
			long segundosAAnadir = intervalo;
			
			if(campanadaDeInteres > 1)
			{
				segundosAAnadir = intervalo * (campanadaDeInteres - 1);
				firstDate.setTime(firstDate.getTime() + segundosAAnadir * 1000);
			}
			
			if(campanadaDeInteres == totalCampanadas)
			{
				firstDate.setTime(secondDate.getTime());
			}
		
			
			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
			String result = formatter.format(firstDate);
			
			System.out.println(result);
			
			
			
		}
		
		
	}

}
