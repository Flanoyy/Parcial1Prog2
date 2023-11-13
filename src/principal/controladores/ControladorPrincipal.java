/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import java.util.ArrayList;
import javax.swing.UIManager;
import pedidos.modelos.Pedido;
import pedidos.vistas.VentanaAMPedido;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.ModeloComboClientes;
import usuarios.modelos.Usuario;
import usuarios.vistas.VentanaAMUsuario;


public class ControladorPrincipal {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        /* PRIMERA PARTE */
        
        Usuario unUsuario1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
        Usuario unUsuario2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
        Usuario unUsuario3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
        Usuario unUsuario4 = new Cliente("cliente3@bar.com", "claveCliente4", "ApellidoCliente4", "NombreCliente4"); 
        //cliente repetido, no debe agregarse

        if (!usuarios.contains(unUsuario1))
            usuarios.add(unUsuario1);
        if (!usuarios.contains(unUsuario2))
            usuarios.add(unUsuario2);
        if (!usuarios.contains(unUsuario3))
            usuarios.add(unUsuario3);
        if (!usuarios.contains(unUsuario4))
            usuarios.add(unUsuario4);

        System.out.println("Clientes");
        System.out.println("========");
        for(Usuario u : usuarios) {
            if (u instanceof Cliente) {
                u.mostrar();
                System.out.println();
            }
        }
        
        Usuario unUsuario5 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1", 1);        
        Usuario unUsuario6 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2", 2);        
        Usuario unUsuario7 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3", 3);
        Usuario unUsuario8 = new Empleado("empleado3@bar.com", "claveEmpleado4", "ApellidoEmpleado4", "NombreEmpleado4", 4);
        //empleado repetido, no debe agregarse

        if (!usuarios.contains(unUsuario5))
            usuarios.add(unUsuario5);
        if (!usuarios.contains(unUsuario6))
            usuarios.add(unUsuario6);
        if (!usuarios.contains(unUsuario7))
            usuarios.add(unUsuario7);
        if (!usuarios.contains(unUsuario8))
            usuarios.add(unUsuario8);

        System.out.println("Empleados");
        System.out.println("=========");
        for(Usuario e : usuarios) {
            if (e instanceof Empleado) {
                e.mostrar();
                System.out.println();
            }
        }
        
        Usuario unUsuario9 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
        Usuario unUsuario10 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
        Usuario unUsuario11 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
        Usuario unUsuario12 = new Encargado("encargado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
        //encargado repetido, no debe agregarse

        if(!usuarios.contains(unUsuario9))
            usuarios.add(unUsuario9);
        if(!usuarios.contains(unUsuario10))
            usuarios.add(unUsuario10);
        if(!usuarios.contains(unUsuario11))
            usuarios.add(unUsuario11);
        if(!usuarios.contains(unUsuario12))
            usuarios.add(unUsuario12);

        System.out.println("Encargados");
        System.out.println("==========");
        for(Usuario e : usuarios) {
            if (e instanceof Encargado) {
                e.mostrar();
                System.out.println();
            }
        }
        
        Usuario unUsuario13 = new Cliente("empleado1@bar.com", "claveCliente13", "ApellidoCliente13", "NombreCliente13");
        if(!usuarios.contains(unUsuario13))
            usuarios.add(unUsuario13);
        //cliente con igual correo que un empleado, no debe agregarse
        
        Usuario unUsuario14 = new Cliente("encargado1@bar.com", "claveCliente14", "ApellidoCliente14", "NombreCliente14");
        if(!usuarios.contains(unUsuario14))
            usuarios.add(unUsuario14);
        //cliente con igual correo que un encargado, no debe agregarse        

        Usuario unUsuario15 = new Empleado("encargado1@bar.com", "claveEmpleado15", "ApellidoEmpleado15", "NombreEmpleado15", 15);
        {
        if(!usuarios.contains(unUsuario15))
            usuarios.add(unUsuario15);
        }
        //empleado con igual correo que un encargado, no debe agregarse  
        
        Usuario unUsuario16 = new Empleado("empleado16@bar.com", "claveEmpleado16", "ApellidoEmpleado16", "NombreEmpleado16", 3);
        if(!usuarios.contains(unUsuario16))
            usuarios.add(unUsuario16);
        //empleado con igual legajo que otro empleado, no debe agregarse  

        System.out.println("Todos los usuarios");
        System.out.println("==================");
        for(Usuario u : usuarios) {
            u.mostrar();
            System.out.println();
        }

        /* SEGUNDA PARTE */
        
        establecerLookAndFeel("Nimbus"); 
        VentanaAMUsuario ventanaAUsuario = new VentanaAMUsuario(null, usuarios);
        
        System.out.println("Todos");
        System.out.println("=====");
        for(Usuario u : usuarios) {
            u.mostrar();
            System.out.println();
        }
      
        /* TERCERA PARTE */
        
        ModeloComboClientes mcc = new ModeloComboClientes(usuarios);
        VentanaAMPedido ventanaAMPedido = new VentanaAMPedido(null, mcc, pedidos);
        
        System.out.println("Pedidos");
        System.out.println("=======");
        for(Pedido p : pedidos) {
            p.mostrar();
            System.out.println();
        }
    }
    
    /**
     * Asigna el look and feel especificado a la ventana
     * @param laf cadena con el nombre del look and feel
     */
    public static void establecerLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
            }
        }
    }
}
