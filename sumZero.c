#include <stdio.h>
#include <math.h>
#include <stdbool.h>

bool somaZero( int a, int b, int c, int d )
{
	return a + b + c + d == 0;
}

int main()
{
	int casos_de_testes, i, j;
	scanf("%d", &casos_de_testes);

	for (i = 0; i < casos_de_testes; ++i)
	{
		int size;
		scanf("%d", &size);

		int listaA[size];
		int listaB[size];
		int listaC[size];
		int listaD[size];

		for (j = 0; j < size; ++j)
		{
			scanf("%d", &listaA[j]);
			scanf("%d", &listaB[j]);
			scanf("%d", &listaC[j]);
			scanf("%d", &listaD[j]);
		}

		int zeroTuples = 0, a, b, c, d;
		
		for (a = 0; a < size; a++)
		{
			for (b = 0; b < size; b++)
			{
				for (c = 0; c < size; c++)
				{
					for (d = 0; d < size; d++)
					{
						if ( somaZero(listaA[a], listaB[b], listaC[c], listaD[d]) )
								zeroTuples++;
					}
				}
			}
		}
		printf("%d\n", zeroTuples);
	}

	return 0;
}