import java.util.Scanner;

public class P413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int casos;
		int x;
		int y;
		int area;
		
		
		casos = teclado.nextInt();
		
		while (casos > 0) {
			casos--;
			
			x = teclado.nextInt();
			y = teclado.nextInt();
			area = x * y;
			
			if (area % 2 == 0) {
				
				x = area / 2;
				y = area / 2;
				
			} else {
				
				x = (area / 2) + 1;
				y = area / 2;
				
			}
			
			System.out.printf("%d %d", x, y);
			System.out.println();
		}
		
		
		
		
		
	}

}
