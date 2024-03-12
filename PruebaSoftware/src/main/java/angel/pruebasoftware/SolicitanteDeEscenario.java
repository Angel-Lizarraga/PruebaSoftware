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
    private Escenario escenario;

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
    
    public void ocuparEscenario(Escenario escenario) {
        // Implementación de ocupar escenario
        this.escenario = escenario; // El solicitante ahora ocupa el escenario
        System.out.println("Ocupando escenario...");
    }

    public void desocuparEscenario() {
        // Implementación de desocupar escenario
        this.escenario = null; // El solicitante ya no ocupa ningún escenario
        System.out.println("Desocupando escenario...");
    }

    public Escenario getEscenario() {
        return escenario;
    }
}