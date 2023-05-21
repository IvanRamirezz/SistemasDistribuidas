/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

/**
 *
 * @author yesen
 */
public class TarjetaDePago {
    private String numeroTarjeta;
    private int codigoCVV;
    private String nombreTitular;
    private double fondos;

    public TarjetaDePago() {
    }

    public TarjetaDePago(String numeroTarjeta, int codigoCVV, String nombreTitular, double fondos) {
        this.numeroTarjeta = numeroTarjeta;
        this.codigoCVV = codigoCVV;
        this.nombreTitular = nombreTitular;
        this.fondos = fondos;
    }

    

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getCodigoCVV() {
        return codigoCVV;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getFondos() {
        return fondos;
    }
    

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setCodigoCVV(int codigoCVV) {
        this.codigoCVV = codigoCVV;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

}