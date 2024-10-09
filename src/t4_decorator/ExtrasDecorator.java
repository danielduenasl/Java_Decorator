/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_decorator;

/**
 *
 * @author PC
 */
public class ExtrasDecorator extends PedidoDecorator {
    
    public ExtrasDecorator(Pedido pedido) {
        super(pedido);
    }
    
    @Override
    public void ServirPedido(Comida c) {
        pedido.ServirPedido(c);
        AddExtra();
    }
    
    public void AddExtra(){
        System.out.println("Se agrega un extra de papas fritas");
    }
}
