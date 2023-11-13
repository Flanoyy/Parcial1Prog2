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
public abstract class Usuario {
    protected String correo, clave, nombre, apellido;
    public ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    public void mostrar(){
        System.out.println(this.apellido + ", " + this.nombre + "\nCorreo:" + this.correo);
    }
    
    public abstract ArrayList<Pedido> verPedidos();
    
    //constructor
    public Usuario(String correo, String clave, String apellido, String nombre) {
            this.correo = correo;
            this.clave = clave;
            this.apellido = apellido;
            this.nombre = nombre;
    }
    //Metodos
    
    public abstract String queSoy();
    
    //ver/asignar
    public String verCorreo() {
        return correo;
    }

    public void asignarCorreo(String correo) {
        this.correo = correo;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    //Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.correo);
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
        if(!(obj instanceof Usuario)){
            return false;
        }
        
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.correo, other.correo);
    }
    
}
