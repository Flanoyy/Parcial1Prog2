
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;        

/**
 *
 * @author Usuario
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;
    private Estado estado;
    private Categoria categoria;
    
    public void mostrar(){
        System.out.println("Producto: " + this.descripcion + "\nPrecio:" + this.precio + "\nCategoria:" + this.categoria + " Estado:" + this.estado);
    }
    
    //toString

    @Override
    public String toString() {
        return "Producto" + codigo;
    }

    
    
    
    
    //Constructor
    public Producto(int codigo, String descripcion, Categoria categoria, Estado estado, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.categoria = categoria;
    }
    
    public Producto(int codigo, String descripcion, Float precio){
        this(codigo,descripcion,null,null,precio);
    }
    public Producto() {
    }
    
    //Get/Set codigo
    public int verCodigo() {
        return codigo;
    }

    public void asignarCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Get/Set descripcion
    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Get/Set precio
    public float verPrecio() {
        return precio;
    }

    public void asignarPrecio(float precio) {
        this.precio = precio;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public Categoria verCategoria() {
        return categoria;
    }

    public void asignarCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    // Comparador de productos 
    // Devuelve true si son iguales

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.codigo;
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }
    
    


    

   
    }
    

    

    
    
    
    
    

