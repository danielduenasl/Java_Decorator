/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_decorator;

/**
 *
 * @author PC
 */
public class Comida {
    
    private int cantidad;
    private String Plato;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getComida() {
        return Plato;
    }

    public void setComida(String Comida) {
        this.Plato = Comida;
    }

    public Comida(int cantidad, String Comida) {
        this.cantidad = cantidad;
        this.Plato = Comida;
    }
    
    
}
