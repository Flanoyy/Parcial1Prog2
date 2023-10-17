/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedido.modelos.Pedido;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String correo, clave, nombre, apellido;
    ArrayList<Pedido> listaPedidos = new ArrayList<>();
    
    //Metodos
    public void mostrar(){
        System.out.println("Cliente: " + this.apellido + ", " + this.nombre + "\nCorreo: " + this.correo);
    }

//    public void hacerPedido(){
//  
//     }
//      
//    public void consultarPedido(){
//        
//    }
//    public void agregarProducto(){
//    
//    }
//    public void quitarProducto(){
//   
//    }
        
    //Constructores
    public Cliente(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente() {
    }
    
    
    //Get/Set Nombre
    public String verNombre() {
        return nombre;
    }
    
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    //Get/Set apellido
    public String verApellido() {
        return apellido;
    }
    
    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Get/Set correo
    public String verCorreo() {
        return correo;
    }
    
    public void asignarCorreo(String correo) {
        this.correo = correo;
    }
    
    //Get/Set Clave de acceso
    public String verClave() {
        return clave;
    }
    
    public void asignarClave(String clave) {
        this.clave = clave;
    }

    // To String
    @Override
    public String toString() {
        return "Cliente{" + "correo=" + correo + ", clave=" + clave + ", nombre=" + nombre + ", apellido=" + apellido + ", listaPedidos=" + listaPedidos + '}';
    }
}
