import java.util.ArrayList;
import java.util.Scanner;

public class Primos {

	static ArrayList<Integer> primos;
	static int qtde_combinacoes = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while ( s.hasNext() ) {
			
			 int n = s.nextInt(); // numero a ser composto por primos
			 int k = s.nextInt(); // quantidade de primos somados
			if ( k == 0 && n == 0 ) return;
			//int teste = 24;
			atualizalistaDePrimos(n);
			//System.out.println(n_maneiras(9, 2, 0, 0, 0));
			n_maneiras(n, k, 0, 0);
			//System.out.println(primos);
			System.out.println(qtde_combinacoes);
			// System.out.println( qtde_combinacoes );
			qtde_combinacoes = 0;
		}
	}

	public static void n_maneiras(int n, int k, int ind, int soma) {
		if (k == 0)
			return;
		for (int i = ind; i < primos.size(); i++) {	
			soma += primos.get(i);
			//System.out.printf("ind %d i %d primo %d soma %d qtd %d n %d \n",ind, i, primos.get(ind), soma, qtde_combinacoes, n);
			if (soma == n && k==1) 	
				qtde_combinacoes++;
			else if (soma > n)
				break;
			//System.out.printf("ind %d i %d primo %d soma %d qtd %d n %d \n",ind, i, primos.get(ind), soma, qtde_combinacoes, n);
			n_maneiras(n, k - 1, i + 1,soma);
			soma -= primos.get(i);
		}

		return;
	}

	public static void atualizalistaDePrimos(int teto) {
		primos = new ArrayList<Integer>();
		for (int i = 2; i <= teto; i++) {
			if (ehPrimo(i))
				primos.add(new Integer(i));
		}
	}

	public static boolean ehPrimo(int n) {
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}
}
