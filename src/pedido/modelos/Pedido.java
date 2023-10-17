/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author matia
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private Estado estado;
    private Cliente cliente;
    private ArrayList<ProductoDelPedido> productosDelPedido;
        
        //Constructores
   
    public Pedido(int numero, LocalDateTime fechaYHora) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
    }

    public Pedido(int numero, LocalDateTime fechaYHora, ArrayList<ProductoDelPedido> ProductosDelPedido, Cliente cliente){
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        this.productosDelPedido = ProductosDelPedido;
        this.estado= Estado.CREANDO;
    }
    
    public Pedido(int numero, LocalDateTime fechaYHora, Estado estado, Cliente cliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.estado = estado;
        this.cliente = cliente;
    }
    
    public Pedido(){
    }
    
        //toString
    
    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", fechaYHora=" + fechaYHora + ", estado=" + estado + ", cliente=" + cliente + '}';
    }
        //Metodos
    
    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }
    
    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }
 
    public String verFecha(){
        return (fechaYHora.getDayOfMonth() + "/" + fechaYHora.getMonthValue() + "/" + fechaYHora.getYear());
    }
    
    public String verHora(){
        return (fechaYHora.getHour() + ":" + fechaYHora.getMinute());
    }
    
    public LocalDateTime verFechaYHora() {
        return fechaYHora;
    }

    public void asignarFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    
    public void asignarFechaYHora(int año, int mes, int dia, int hora, int minuto){
        this.fechaYHora = LocalDateTime.of(año, mes, dia, hora, minuto);
    }
    
    public ArrayList<ProductoDelPedido> VerProductosDelPedido() {
        return productosDelPedido;
    }

    public void asignarProductosDelPedido(ArrayList<ProductoDelPedido> ProductosDelPedido) {
        if (!ProductosDelPedido.contains(this.productosDelPedido)){
            this.productosDelPedido = ProductosDelPedido;
            
        }
    }
    
    public void mostrarProductosDelPedido(){
        for (ProductoDelPedido unProducto:productosDelPedido){
            System.out.println("\t" + unProducto.verDescripcion()+ "\t"+ unProducto.verCantidad());
        }
    }
    
    public void mostrar(){
        System.out.println("Nro: " + numero + "\nFecha: " + this.verFecha() + "\t\tHora: " + this.verHora() + "\nCliente: " + cliente.verApellido() + ", " + cliente.verNombre() + "\nEstado: " + estado +"\n\tProducto\tCantidad\n============================================\n\t\t");
        this.mostrarProductosDelPedido();
    }
    // Comparador de pedidos iguales

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        return this.numero == other.numero;
    }
}