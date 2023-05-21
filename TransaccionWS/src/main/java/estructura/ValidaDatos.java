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
 


    public TarjetaDePago vTarjeta(String numeroTarjeta, int codigoCVV, String nombreTitular){
       TarjetaDePago tarjeta=null;
        Connection accesoDB = conexion.getConexion();
        try {
            
            PreparedStatement ps = accesoDB.prepareStatement("select * from tarjetasdedebito where numeroTarjeta=? and codigoCVV=? and nombreTitular=?");
            ps.setString(1, numeroTarjeta);
            ps.setInt(2, codigoCVV);
            ps.setString(3, nombreTitular);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               tarjeta = new TarjetaDePago();
               tarjeta.setNumeroTarjeta(rs.getString(1));
               tarjeta.setCodigoCVV(rs.getInt(2));
               tarjeta.setNombreTitular(rs.getString(3));
               tarjeta.setFondos(rs.getDouble(4));
               return tarjeta;
            }
        } catch (Exception e) {
        }
        return tarjeta;
    }
    
    public ProductosBD vProducto(int id_producto){
       ProductosBD producto=null;
        Connection accesoDB = conexion.getConexion();
        try {
            
            PreparedStatement ps = accesoDB.prepareStatement("select * from productos where idProducto=?");
            ps.setInt(1, id_producto);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
               producto = new ProductosBD();
               producto.setId_producto(rs.getInt(1));
               producto.setNombreProducto(rs.getString(2));
               producto.setPrecio(rs.getDouble(3));
               producto.setNumero_productos(rs.getInt(4));
              
               return producto;
            }
        } catch (Exception e) {
        }
        return producto;
    }

}
