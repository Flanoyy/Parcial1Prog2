/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import java.util.Objects;
import pedidos.modelos.Pedido;

/**
 *
 * @author Usuario
 */
public class Empleado extends Usuario{
    
    private final ArrayList<Pedido> pedidoVacio = new ArrayList<>();
    private int legajo;
    
    //Metodos
    
    
    
    @Override
    public ArrayList<Pedido> verPedidos() {
        return pedidoVacio;
    }
    
    //Constructor

    public Empleado(String correo, String clave, String apellido, String nombre,int legajo) {
        super(correo, clave, apellido, nombre);
        this.legajo=legajo;
        }

    //Metodos

    public int verLegajo() {
        return legajo;
    }

    public void asignarLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    //equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)==false){
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
            return(this.legajo == other.legajo);
           
        }else {
            return super.equals(obj);
        }       
    }
    
    @Override
    public String queSoy() {
        return "Empleado";
    }
    
    }
