/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumidortws;

/**
 *
 * @author yesen
 */
public class ConsumidorTWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean comprar=comprar(1,100.00,2,200);
        boolean pagar=pagar("1111222233334444",20000,"Juan Perez",123);
        
        if(comprar){
            System.out.println("COMPRA EXITOSA");
        }else{
            System.out.println("ERROR DE COMPRA");
        }
        
        if(pagar){
            System.out.println("TRANSACCION EXITOSA");
        }else{
            System.out.println("ERROR DE TRANSACCION");
        }
    }

    private static boolean comprar(int idProducto, double precio, int numeroProductos, double total) {
        consumidortws.GestionTransaccion_Service service = new consumidortws.GestionTransaccion_Service();
        consumidortws.GestionTransaccion port = service.getGestionTransaccionPort();
        return port.comprar(idProducto, precio, numeroProductos, total);
    }

    private static boolean pagar(java.lang.String numeroTarjeta, double monto, java.lang.String nombre, int codigoCVV) {
        consumidortws.GestionTransaccion_Service service = new consumidortws.GestionTransaccion_Service();
        consumidortws.GestionTransaccion port = service.getGestionTransaccionPort();
        return port.pagar(numeroTarjeta, monto, nombre, codigoCVV);
    }
    
}
