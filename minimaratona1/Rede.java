import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Rede {
	
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String comando[];
		int emp = sc.nextInt();
		int [] vet = new int[emp];
		sc.nextLine();
		while(t>0)
		{
			comando = sc.nextLine().split(" ");
			
			if(comando[0].equals("E"))
			{
				System.out.println(Math.abs(vet[Integer.parseInt(comando[1])-1] - Integer.parseInt(comando[1]))%1000);
			}else if(comando[0].equals("I"))
			{
				tag+= Math.abs(Integer.parseInt(comando[1]) - Integer.parseInt(comando[2]))%1000;
			}else
				t--;
			
		}
	}
	
	public static int calc(int[] l, int i){}

}
/*1584
 * import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String cadeia = "";
		ArrayList<String> cad = new ArrayList();
		while(t>0)
		{
			cadeia = sc.next();
			for(int i =0; i < cadeia.length(); i++)
				cad.add(cadeia.substring(i, cadeia.length())+cadeia.substring(0, i));
			Collections.sort(cad);
			System.out.println(cad.get(0));
			cad.clear();
			t--;
		}
		
	}

}
 * 
 * */
