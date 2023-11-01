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
    

    public void agregarPedido(Pedido unPedido){
        if(unPedido!=null){
            if(!listaPedidos.contains(unPedido)){ //Si no esta lo agrega
            listaPedidos.add(unPedido);
        }else{
            listaPedidos.remove(unPedido);  //Si esta lo reemplaza
            listaPedidos.add(unPedido);
            }
        }
    }
    
    public void cancelarPedido(Pedido unPedido){
        if(listaPedidos.contains(unPedido))
            listaPedidos.remove(unPedido);
    }
    
    @Override
    public ArrayList<Pedido> verPedidos(){
        return listaPedidos;
    }
        
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
