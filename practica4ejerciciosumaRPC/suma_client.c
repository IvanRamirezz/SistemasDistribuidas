/*
 * código es un cliente RPC que se encarga de invocar una función  
 * remota "suma" utilizando los argumentos proporcionados 
 * y mostrar el resultado en la consola
 */

#include "suma.h"
#include <stdio.h>

void
suma_prog_1(char *host, int a, int b) //funcion que se encarga de crear un objeto de tipo "CLIENT" utilizando la dirección proporcionada como argumento
{
	CLIENT *clnt;
	int  *result_1;
	dupla_int  suma_1_arg;

#ifndef	DEBUG
	clnt = clnt_create (host, SUMA_PROG, SUMA_VERS, "udp"); //se utiliza para crear el objeto CLIENT y establecer una conexión con el servidor RPC
	if (clnt == NULL) {
		clnt_pcreateerror (host);
		exit (1);
	}
#endif	/* DEBUG */
	suma_1_arg.a=a;
	suma_1_arg.b=b;
	result_1 = suma_1(&suma_1_arg, clnt);
	if (result_1 == (int *) NULL) {
		clnt_perror (clnt, "call failed");
	}else{
		printf("result=%d\n", *result_1);
	}
#ifndef	DEBUG
	clnt_destroy (clnt);
#endif	 /* DEBUG */
}


int
main (int argc, char *argv[])
{
/* La función "main" es responsable de procesar los argumentos de línea de comando
 * y llamar a la función "suma_prog_1" con los argumentos proporcionados. 
 * rSi se proporcionan menos de tres argumentos, se imprime un mensaje de
 * uso en la consola y se sale del programa. 
 */
   
	char *host;
	int a,b;
	if (argc != 4) {
		printf ("usage: %s server_host\n", argv[0]);
		exit (1);
	}
	host = argv[1];
	if((a = atoi(argv[2])) == 0 && *argv[2] != '0'){
	fprintf(stderr, "invalid value: %s\n",argv[2]);
	exit(1);

	}
	if((b = atoi(argv[3])) == 0 && *argv[3] != '0'){
	fprintf(stderr, "invalid value: %s\n",argv[3]);
	exit(1);

	}
	suma_prog_1 (host, a, b);
exit (0);
}
