import java.util.Scanner;

public class TeclasTrocadas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (s.hasNext()) {
			String frase = s.nextLine();
			StringBuilder fraseAlterada = new StringBuilder(frase);
			
			for ( int i = 0; i < fraseAlterada.length(); i++ ) {
				switch (fraseAlterada.charAt(i)) {
				case 'a': fraseAlterada.setCharAt(i, 'd'); break;
				case 'd': fraseAlterada.setCharAt(i, 'a'); break;
				case 'b': fraseAlterada.setCharAt(i, 'p'); break;
				case 'p': fraseAlterada.setCharAt(i, 'b'); break;
				}
			}		
			System.out.println( fraseAlterada );
		}
	}
}
