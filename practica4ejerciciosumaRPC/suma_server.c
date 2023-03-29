/*
 * código muestra cómo implementar una función remota en el lado del servidor  
 * utilizando RPCGen y C, y cómo manipular los datos de entrada y salida
 * que se reciben y se envían a través de la conexión RPC
 */

#include "suma.h"

int *
suma_1_svc(dupla_int *argp, struct svc_req *rqstp)//Esta es la función remota "suma", que se invoca cuando se recibe una solicitud RPC de un cliente
{
	static int  result;//declara una variable estática "result" de tipo entero, que almacena el resultado de la suma

	printf("Server response to client...\n"); //Muestra al usuario que el servidor esta recibiendo solictudes del cliente
	printf("parameters: %d, %d\n", argp->a,argp->b); // Esta línea muestra los parámetros de entrada que se recibieron del cliente
	result = argp->a + argp->b; //Esta línea suma los dos números enteros y almacena el resultado en la variable "result"
	printf("returning: %d\n",result);//Esta línea muestra el resultado de la suma en la consola del servidor
	return &result;//Esta línea devuelve un puntero al resultado de la suma al cliente a través de la conexión RPC

}
