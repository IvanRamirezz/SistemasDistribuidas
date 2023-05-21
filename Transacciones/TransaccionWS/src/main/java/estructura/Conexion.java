/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author yesen
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    public Conexion() {
    }

    public Connection getConexion(){
        Connection conect=null;
        try{
            /* Carga|Registra el driver JDBC */
            Class.forName("com.mysql.jdbc.Driver");
            /* Obtener la conexion */
	    conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root","");
        }catch(Exception e){ 
            JOptionPane.showInputDialog(null,"Error"+e);
        }
        return conect;
    } 
}
