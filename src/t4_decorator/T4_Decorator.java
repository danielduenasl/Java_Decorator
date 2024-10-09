/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_decorator;

/**
 *
 * @author PC
 */
public class T4_Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comida comida = new Comida(2,"Frijoles volteados");
        
        Pedido pedido = new Desayuno();
        Pedido pedidoExtra = new ExtrasDecorator(pedido);
        
        pedidoExtra.ServirPedido(comida);
    }
    
}
