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
public class Encargado extends Usuario{
    
    private final ArrayList<Pedido> pedidoVacio = new ArrayList<>();
    
    //Metodos
    
    
    @Override
    public ArrayList<Pedido> verPedidos() {
        return pedidoVacio;
    }
    
    //Constructor
    
    public Encargado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
}
