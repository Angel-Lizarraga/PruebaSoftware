/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel.pruebasoftware;

/**
 *
 * @author aanng
 */
public class SolicitanteDeEscenario extends Visitante {
    private String motivo;

    public SolicitanteDeEscenario(String nombre, String email, String motivo) {
        super(nombre, email);
        this.motivo = motivo;
    }

    public void solicitarEscenario() {
        // Implementación de solicitar escenario
        System.out.println("Solicitando escenario...");
    }

    public void editarSolicitud() {
        // Implementación de editar solicitud
        System.out.println("Editando solicitud...");
    }

    public void borrarSolicitud() {
        // Implementación de borrar solicitud
        System.out.println("Borrando solicitud...");
    }
}