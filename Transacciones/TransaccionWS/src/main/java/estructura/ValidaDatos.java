/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;
import java.sql.*;
/**
 *
 * @author yesen
 */
public class ValidaDatos {
    Conexion conexion;

    public ValidaDatos() {
        conexion = new Conexion();
    }
 


    public TarjetaDePago vTarjeta(String numeroTarjeta, int codigoCVV){
         TarjetaDePago tarjeta = null;
       Connection accesoDB = null;
       PreparedStatement ps = null;
       ResultSet rs = null;

       try {
           accesoDB = conexion.getConexion();
           ps = accesoDB.prepareStatement("SELECT * FROM tarjetasdedebito WHERE numeroTarjeta=? AND codigoCVV=?");
           ps.setString(1, numeroTarjeta);
           ps.setInt(2, codigoCVV);
            
           rs = ps.executeQuery();
           if (rs.next()) {
               tarjeta = new TarjetaDePago();
               tarjeta.setNumeroTarjeta(rs.getString(2));
               tarjeta.setCodigoCVV(rs.getInt(3));
               tarjeta.setNombreTitular(rs.getString(4));
               tarjeta.setFondos(rs.getDouble(5));
           }
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           try {
               // Cierra los objetos ResultSet, PreparedStatement y Connection en un orden inverso al que se abrieron
               if (rs != null) {
                   rs.close();
               }
               if (ps != null) {
                   ps.close();
               }
               if (accesoDB != null) {
                   accesoDB.close();
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
       }

       return tarjeta;
   }
    
    public ProductosBD vProducto(int id_producto){
       ProductosBD producto = null;
       Connection accesoDB = null;
       PreparedStatement ps = null;
       ResultSet rs = null;

       try {
           accesoDB = conexion.getConexion();
           ps = accesoDB.prepareStatement("SELECT * FROM productos WHERE idProducto=?");
           ps.setInt(1, id_producto);
           
            
           rs = ps.executeQuery();
           if (rs.next()) {
               producto = new ProductosBD();
               producto.setId_producto(rs.getInt(1));
               producto.setNombreProducto(rs.getString(2));
               producto.setPrecio(rs.getDouble(3));
               producto.setNumero_productos(rs.getInt(4));
           }
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           try {
               // Cierra los objetos ResultSet, PreparedStatement y Connection en un orden inverso al que se abrieron
               if (rs != null) {
                   rs.close();
               }
               if (ps != null) {
                   ps.close();
               }
               if (accesoDB != null) {
                   accesoDB.close();
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
       }

       return producto;
   }
}
