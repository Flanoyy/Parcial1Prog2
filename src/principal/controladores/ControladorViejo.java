///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package principal.controladores;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import pedido.modelos.Pedido;
//import productos.modelos.Estado;
//import productos.modelos.Categoria;
//import productos.modelos.Producto;
//import usuarios.modelos.Cliente;
//import usuarios.modelos.Empleado;
//import usuarios.modelos.Encargado;
//
///**
// *
// * @author Mariana
// */
//public class ControladorViejo {
//    public static void main(String[] args) {
//        
//        
//        //Definir un ArrayList para cada una de las clases Cliente, 
//       // Empleado, Encargado y Producto  (realizar las importaciones correspondientes).
//        ArrayList<Cliente> listaClientes = new ArrayList<>();
//        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
//        ArrayList<Encargado> listaEncargados = new ArrayList<>();
//        ArrayList<Producto> listaProductos = new ArrayList<>();
//        ArrayList<Pedido> listaPedidos = new ArrayList<>();
//        //Instanciar 3 objetos de cada clase y guardarlos en su correspondiente ArrayList. 
//    //EMPLEADOS
//    
//        Empleado e1 = new Empleado();
//        Empleado e2 = new Empleado();
//        Empleado e3 = new Empleado();
//        
//        e1.asignarApellido("Apellido1");
//        e1.asignarNombre("Nombre1");
//        e1.asignarCorreo("empleado1@mail.com");
//        e1.asignarClave("clave1");
//                     
//        e2.asignarApellido("Apellido2");
//        e2.asignarNombre("Nombre2");
//        e2.asignarCorreo("empleado2@mail.com");
//        e2.asignarClave("clave2");
//        
//        e3.asignarApellido("Apellido3");
//        e3.asignarNombre("Nombre3");
//        e3.asignarCorreo("empleado3@mail.com");
//        e3.asignarClave("clave3");
//        
//        listaEmpleados.add(e1);
//        listaEmpleados.add(e2);
//        listaEmpleados.add(e3);
//        
//        System.out.println("#################### ");
//        System.out.println("EMPLEADOS ");
//        //Recorrer cada ArrayList y mostrar su contenido por pantalla. 
//        for (Empleado e: listaEmpleados)
//            e.mostrar();
//        
//        //Realizar algunas modificaciones a algunos de los objetos antes creados, 
//        //e1.asignarApellido("APELLIDOEmpleado1");
//        //listaEmpleados.ver(1).nombre="NOMBRE";
//        
//        //y volver a recorrer los ArrayLists verificando que se hicieron los cambios. 
//         //for (Empleado e: listaEmpleados)
//           // e.mostrar();
//    
//    //PRODUCTOS
//    
//        Producto p1 = new Producto();
//        Producto p2= new Producto();
//        Producto p3 = new Producto();
//        
//        p1.asignarCodigo(1);
//        p1.asignarDescripcion("Milanesa a caballo");
//        p1.asignarPrecio(1250.0f);
//        p1.asignarCategoria(Categoria.PLATOPRINCIPAL);
//        p1.asignarEstado(Estado.DISPONIBLE);
//        
//        p2.asignarCodigo(2);
//        p2.asignarDescripcion("Empanadas");
//        p2.asignarPrecio(150.70f);
//        p2.asignarCategoria(Categoria.PLATOPRINCIPAL);
//        p2.asignarEstado(Estado.DISPONIBLE);
//        
//        p3.asignarCodigo(3);
//        p3.asignarDescripcion("Flan con dulce");
//        p3.asignarPrecio(850.0f);
//        p3.asignarCategoria(Categoria.POSTRE);
//        p3.asignarEstado(Estado.NODISPONIBLE);
//        
//        listaProductos.add(p1);
//        listaProductos.add(p2);
//        listaProductos.add(p3);
//        
//        System.out.println("#################### ");
//        System.out.println("PRODUCTOS");
//        
//        for (Producto p: listaProductos){
//            p.mostrar();
//        }
//    
//         
//    //ENCARGADOS
//    
//        
//        Encargado en1= new Encargado();
//        Encargado en2= new Encargado();
//        Encargado en3= new Encargado();
//        
//        en1.asignarApellido("Apellido1");
//        en1.asignarNombre("Nombre1");
//        en1.asignarCorreo("encargado1@mail.com");
//        en1.asignarClave("clave1");
//                     
//        en2.asignarApellido("Apellido2");
//        en2.asignarNombre("Nombre2");
//        en2.asignarCorreo("encargado2@mail.com");
//        en2.asignarClave("clave2");
//        
//        en3.asignarApellido("Apellido3");
//        en3.asignarNombre("Nombre3");
//        en3.asignarCorreo("encargado3@mail.com");
//        en3.asignarClave("clave3");
//        
//        listaEncargados.add(en1);
//        listaEncargados.add(en2);
//        listaEncargados.add(en3);
//        
//        System.out.println("#################### ");
//        System.out.println("ENCARGADOS");
//        
//        for (Encargado en: listaEncargados)
//            en.mostrar();
//
//    //CLIENTES
//    
//    
//        Cliente cliente1= new Cliente("cliente1@mail.com", "clave1", "Nombre1", "Apellido1");
//        Cliente cliente2= new Cliente("cliente2@mail.com", "clave2", "Nombre2", "Apellido2");
//        Cliente cliente3= new Cliente("cliente3@mail.com", "clave3", "Nombre3", "Apellido3");
//        
//        
//        listaClientes.add(cliente1);
//        listaClientes.add(cliente2);
//        listaClientes.add(cliente3);
//        
//        System.out.println("#################### ");
//        System.out.println("CLIENTES");
//        
//        for (Cliente c:listaClientes){
//            c.mostrar();
//        }
//    
//    //PEDIDOS
//        
//        Pedido pedido1= new Pedido(1,LocalDateTime.of(2023, 10, 4, 21, 54), pedido.modelos.Estado.CREADO,cliente1);
//        Pedido pedido2= new Pedido(2,LocalDateTime.now(), pedido.modelos.Estado.SOLICITADO,cliente2);
//        Pedido pedido3= new Pedido(3,LocalDateTime.of(2023, 10, 4, 21, 54), pedido.modelos.Estado.PROCESANDO,cliente3);
//    
//    
//        listaPedidos.add(pedido1);
//        listaPedidos.add(pedido2);
//        listaPedidos.add(pedido3);
//    
//        System.out.println("#################### ");
//        System.out.println("PEDIDOS");
//        for(Pedido p:listaPedidos){
//            p.mostrar();
//    }
//  }
//}