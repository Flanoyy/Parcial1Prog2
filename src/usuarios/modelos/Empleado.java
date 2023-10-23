/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author Usuario
 */
public class Empleado extends Usuario{
    
    @Override
    public void mostrar(){
        System.out.println(this.apellido + ", " + this.nombre + "\nCorreo:" + this.correo);
    }
    //Constructor

    public Empleado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
        }
    }
