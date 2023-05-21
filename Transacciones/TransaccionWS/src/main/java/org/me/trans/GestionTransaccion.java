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
            @WebParam(name = "monto") double monto,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "codigo_CVV") int codigoCVV) {

        // Validación de la tarjeta
        
       ValidaDatos valida = new ValidaDatos();
        
        TarjetaDePago tar=valida.vTarjeta(numeroTarjeta, codigoCVV);
       
        if(tar== null) {
        return false;
        }else if(tar.getFondos()<=monto){
            return false;
        }else{
            return true;
        }
    }
   

    @WebMethod
    public boolean Comprar(
            @WebParam(name = "id_producto") int idProducto,
            @WebParam(name = "precio") double precio,
            @WebParam(name = "numero_productos") int numeroProductos,
            @WebParam(name = "total") double total) {
        
           double decimal =0; 
           decimal=(double) numeroProductos;
          
        // Validación de disponibilidad de productos
        ValidaDatos valida;
        valida= new ValidaDatos();
        
        ProductosBD pro=valida.vProducto(idProducto);
         decimal=decimal*pro.getPrecio();
        if(pro==null){
            return false;
        }else if(pro.getNumero_productos()< numeroProductos){
            return false;
        }else if(pro.getPrecio()!=precio){
            return false;
        }else if(decimal!=total){
            return false;
        }else{
            return true;
        }   
        
    }

}