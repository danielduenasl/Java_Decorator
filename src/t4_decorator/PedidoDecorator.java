/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_decorator;

/**
 *
 * @author PC
 */
public abstract class PedidoDecorator implements Pedido {
    
    protected Pedido pedido;
    
    @Override
    public void ServirPedido(Comida c) {
        this.pedido.ServirPedido(c);
    }

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
}
