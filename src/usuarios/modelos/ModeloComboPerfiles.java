/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import javax.swing.DefaultComboBoxModel;




/**
 *
 * @author estudiante
 */
public class ModeloComboPerfiles extends DefaultComboBoxModel{
    
    //Constructor
   
    public ModeloComboPerfiles() { 
        for (Perfil valor : Perfil.values()) {
            this.addElement(valor); 
        }
    }
    
    
    //Devuelve el perfil seleccionado
    
    public Perfil obtenerPerfil() { 
        return (Perfil)this.getSelectedItem();
    }
    
    //Selecciona el perfil especificado
    
    public void seleccionarEstado(Perfil valor) {
        this.setSelectedItem(valor);
    }
}
