/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_decorator;

/**
 *
 * @author PC
 */
public class Almuerzo implements Pedido {

    @Override
    public void ServirPedido(Comida c) {

        System.out.println("Se entrega el almuerzo!");
        if(c.getCantidad() > 1){
            System.out.println(c.getCantidad() + " platos de " + c.getComida());
        } else {
            System.out.println(c.getCantidad() + " plato de " + c.getComida());
        }
        
    }
    
}
