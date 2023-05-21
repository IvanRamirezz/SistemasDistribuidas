/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package org.me.trans;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import estructura.*;

/**
 *
 * @author yesen
 */
@WebService(serviceName = "GestionTransaccion")

public class GestionTransaccion {
   public boolean Pagar(
            @WebParam(name = "numero_tarjeta") String numeroTarjeta,
            @WebParam(name = "monto") int monto,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "codigo_CVV") int codigoCVV) {

        // Validación de la tarjeta
        ValidaDatos valida;
        valida= new ValidaDatos();
        
        TarjetaDePago tar=valida.vTarjeta(numeroTarjeta, codigoCVV, nombre);
        if(tar==null || tar.getFondos()<monto){
                System.out.println("FALLO DE TRANSACCION");
            return false;
        }else{
            System.out.println("TRANSACCION EXITOSA");
            return true;
        }   
 
    }
   

    @WebMethod
    public boolean Comprar(
            @WebParam(name = "id_producto") int idProducto,
            @WebParam(name = "precio") double precio,
            @WebParam(name = "numero_productos") int numeroProductos,
            @WebParam(name = "total") double total) {

        // Validación de disponibilidad de productos
        ValidaDatos valida;
        valida= new ValidaDatos();
        
        ProductosBD pro=valida.vProducto(idProducto);
        if(pro==null || pro.getNumero_productos()==0){
                System.out.println("FALLO DE COMPRA");
            return false;
        }else{
            System.out.println("COMPRA EXITOSA");
            return true;
        }   

        // Procesamiento de la compra
        // Aquí iría la lógica real para procesar la compra

    }

}