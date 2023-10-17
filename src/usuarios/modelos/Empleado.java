/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;
/**
 *
 * @author Usuario
 */
public class Empleado {
    private String correo, clave, nombre, apellido;
    
    
    public void mostrar(){
        System.out.println("Empleado:" + this.apellido + ", " + this.nombre + "\nCorreo:" + this.correo);
    }
    //Constructor

    public Empleado(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
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
    
}
