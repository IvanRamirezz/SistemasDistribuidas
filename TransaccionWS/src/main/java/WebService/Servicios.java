/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package WebService;

import estructura.ValidaDatos;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ivanramirez
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    /**
     * This is a sample web service operation
     */
    ValidaDatos datos = new ValidaDatos();
   
    @WebMethod(operationName = "listar")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
