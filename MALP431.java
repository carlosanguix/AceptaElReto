import java.util.Scanner;

public class MALP431 {

	public static int[] ordenarVector(int[] totMidi) {

		int aux;

		for (int i = 0; i < totMidi.length - 1; i++) {
			for (int j = i + 1; j < totMidi.length; j++) {
				
				if (totMidi[i] < totMidi[j]) {
					
					aux = totMidi[i];
					totMidi[i] = totMidi[j];
					totMidi[j] = aux;
				}
			}
		}

		return totMidi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int familias;
		int totHijos;
		int midiclorianos;
		int hijo;
		int totMidiclorianos;
		int mejorHijo;
		int[] hijoFamilia;

		familias = sc.nextInt();

		while (familias != 0) {

			hijoFamilia = new int[familias];
			
			for (int i = 0; i < familias; i++) {

				totHijos = sc.nextInt();
				midiclorianos = sc.nextInt();
				mejorHijo = 0;
				
				for (int j = 0; j < totHijos; j++) {

					hijo = sc.nextInt();
					totMidiclorianos = hijo * midiclorianos;
					
					if (totMidiclorianos > mejorHijo) {
						
						mejorHijo = totMidiclorianos;
					}
				}
				
				hijoFamilia[i] = mejorHijo;
			}
			
			ordenarVector(hijoFamilia);
			
			for (int i = 0; i < hijoFamilia.length; i++) {
				
				System.out.printf("%d", hijoFamilia[i]);
				if (i != hijoFamilia.length - 1) {
					System.out.printf(" ");
				}
			}
			
			System.out.println();
			familias = sc.nextInt();
		}

	}




}


