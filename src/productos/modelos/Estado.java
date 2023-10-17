/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author matia
 */
public enum Estado {
    DISPONIBLE("Disponible"),
    NODISPONIBLE("No Disponible");

    private final String valor;
    
    private Estado(String valor){
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return this.valor;
    }

    
}
