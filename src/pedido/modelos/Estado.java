/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedido.modelos;

/**
 *
 * @author matia
 */
public enum Estado {
    CREANDO("Creando"),
    SOLICITADO("Solicitado"),
    PROCESANDO("Procesando"),
    ENTREGADO("Entredago");
    
    private final String valor;

    private Estado(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
    
    
}
