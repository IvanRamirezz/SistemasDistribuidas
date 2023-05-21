/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author yesen
 */
public class ProductosBD {
    int id_producto;
    String NombreProducto; 
    double precio;
    int numero_productos;

    public ProductosBD() {
    }

    public ProductosBD(int id_producto, String NombreProducto, double precio, int numero_productos) {
        this.id_producto = id_producto;
        this.NombreProducto = NombreProducto;
        this.precio = precio;
        this.numero_productos = numero_productos;
    }

  

  
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumero_productos() {
        return numero_productos;
    }

    public void setNumero_productos(int numero_productos) {
        this.numero_productos = numero_productos;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }
    
    
}
