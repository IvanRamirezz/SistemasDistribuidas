/* Programa random_local.c que incluye unicamente el programa main */
#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include "random_local.h"

int main(int argc, char *argv[])
{
int misemilla, itera, i;
	if(argc != 3) {
	printf("\n¡¡¡ERROR DE PARAMETROS VERIFICA QUE UTILICES EXACTAMENTE 2 PARAMETROS DE TIPO ENTERO!!! \n EL PRIMERO: %s como semilla y EL SEGUNDO: %s iteraciones\n\n", argv[1],argv[2]);
	exit(1);
}
	printf("Uso: %s como semilla y %s iteraciones\n", argv[1],argv[2]);
	misemilla = (long)atoi(argv[1]);
	itera = atoi(argv[2]);
	inicializa_random(misemilla);
	for(i = 0; i < itera; i++)
		printf("%d : %lf\n", i, obtiene_siguiente_random());
	exit(0);
}
