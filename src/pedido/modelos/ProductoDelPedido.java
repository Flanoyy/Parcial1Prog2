/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;

import productos.modelos.Producto;

/**
 *
 * @author estudiante
 */
public class ProductoDelPedido {
    private int cantidad;
    private Producto unProducto;

    //Constructor
    public ProductoDelPedido(Producto unProducto, int cantidad) {
        this.cantidad = cantidad;
        this.unProducto = unProducto;
    }

    //Get/Sets
    public int verCantidad() {
        return cantidad;
    }

    public void asignarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto verUnProducto() {
        return unProducto;
    }

    public void asignarUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }
    
    public String verDescripcion(){
        return unProducto.verDescripcion();
    }
    
    
    
}
