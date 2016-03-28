import java.util.Scanner;

class SumZero {
	
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in );

		int [] listA, listB, listC, listD;

		int testCases = s.nextInt();
		s.nextLine();

		for (int i = 0; i < testCases; i++) {
			int listSize = s.nextInt();
			listA = new int[listSize];
			listB = new int[listSize];
			listC = new int[listSize];
			listD = new int[listSize];

			for ( int j = 0; j < listSize; j++ ) {
				listA[j] = s.nextInt();
				listB[j] = s.nextInt();
				listC[j] = s.nextInt();
				listD[j] = s.nextInt();
			}

			int zeroTuples = 0;

			for (int a = 0; a < listSize; a++) {
				for (int b = 0; b < listSize; b++) {
					for (int c = 0; c < listSize; c++) {
						for (int d = 0; d < listSize; d++) {
							if ( somaZero(listA[a], listB[b], listC[c], listD[d]) )
								zeroTuples++;
						}
					}
				}
			}
			System.out.println(zeroTuples);
		}
	}

	public static boolean somaZero( int a, int b, int c, int d ) {
		return a + b + c + d == 0; 
	}
}

/*
Problema 1152

1

6
-45 22 42 -16
-41 -27 56 30
-36 53 -37 77
-36 30 -75 -46
26 -38 -10 62
-32 -54 -6 45

*/
