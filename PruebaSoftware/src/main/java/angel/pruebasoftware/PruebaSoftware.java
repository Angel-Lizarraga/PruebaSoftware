/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package angel.pruebasoftware;

/**
 *
 * @author aanng
 */
public class PruebaSoftware {
    public static void main(String[] args) {
        // Crear objetos Administrador, Visitante y SolicitanteDeEscenario
        Administrador administrador = new Administrador("Admin", "admin@example.com");
        Visitante visitante = new Visitante("Visitante", "visitante@example.com");
        SolicitanteDeEscenario solicitante = new SolicitanteDeEscenario("Solicitante", "solicitante@example.com", "Motivo");

        
        
        System.out.println("Acciones del administrador");
        System.out.println("");
// Autenticar administrador
        administrador.autenticar();

        // Consultar solicitudes
        administrador.consultarSolicitudes();

        // Aceptar una solicitud
        administrador.aceptarSolicitud();

        // Rechazar una solicitud
        administrador.rechazarSolicitud();

        // Publicar un evento
        administrador.publicarEvento();
        System.out.println("");
        
        System.out.println("Acciones del visitante");
        System.out.println("");
        
        // Consultar calendario como visitante
        visitante.consultarCalendario();
        System.out.println("");
        System.out.println("Acciones del solicitante");
        System.out.println("");
        // Solicitar un escenario como solicitante
        solicitante.solicitarEscenario();

        // Editar una solicitud como solicitante
        solicitante.editarSolicitud();

        // Borrar una solicitud como solicitante
        solicitante.borrarSolicitud();

        // Consultar calendario como solicitante
        solicitante.consultarCalendario();
    }
}