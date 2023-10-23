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
public class Cliente extends Usuario{
    ArrayList<Pedido> listaPedidos = new ArrayList<>();

    //Metodos
    @Override
    public void mostrar(){
        System.out.println(this.apellido + ", " + this.nombre + "\nCorreo:" + this.correo);
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
        super(correo, clave, apellido, nombre);
    }
    
    // To String
    @Override
    public String toString() {
        return "Cliente{" + "correo=" + super.verCorreo() + ", clave=" + super.verClave() + ", nombre=" + super.verNombre() + ", apellido=" + super.verApellido() + ", listaPedidos=" + listaPedidos + '}';
    }
}
