/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Flanoy
 */
public class ModeloComboClientes extends DefaultComboBoxModel {
    
    //Constructor
   
    public ModeloComboClientes(ArrayList<Usuario> usuarios) { 
        for (Usuario unUsuario : usuarios) {
            if(unUsuario.queSoy().contains("Cliente")){
                this.addElement(unUsuario);
            } 
        }
    }
    
    //Devuelve el cliente
    
    public Cliente obtenerCliente() { 
        return (Cliente)this.getSelectedItem();
    }
    
    //Selecciona el cliente
    
    public void seleccionarCliente(Cliente unCliente) {
        this.setSelectedItem(unCliente);
    }
    
}
