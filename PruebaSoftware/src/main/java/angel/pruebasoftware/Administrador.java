/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel.pruebasoftware;

/**
 *
 * @author aanng
 */
public class Administrador {
    private String nombre;
    private Escenario escenario; // Relación entre Administrador y Escenario
    private Calendario calendario; // Relación entre Administrador y Calendario
    
    public Administrador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    private String email;


    public void autenticar() {
        // Implementación de autenticación
        System.out.println("Autenticando...");
    }

    public void consultarSolicitudes() {
        // Implementación de consulta de solicitudes
        System.out.println("Consultando solicitudes...");
    }

    public void aceptarSolicitud() {
        // Implementación de aceptar solicitud
        System.out.println("Aceptando solicitud...");
    }

    public void rechazarSolicitud() {
        // Implementación de rechazar solicitud
        System.out.println("Rechazando solicitud...");
    }

    public void publicarEvento() {
        // Implementación de publicar evento
        System.out.println("Publicando evento...");
    }

    public void consultarCalendario() {
        // Implementación de consultar calendario
        System.out.println("Consultando calendario...");
    }

    public void editarCalendario() {
        // Implementación de editar calendario
        System.out.println("Editando calendario...");
    }
    
    public void administraEscenario(Escenario escenario) {
        // Implementación de administrar escenario
        this.escenario = escenario; // El administrador ahora administra el escenario
        System.out.println("Administrando escenario...");
    }

    public void gestionaCalendario(Calendario calendario) {
        // Implementación de gestionar calendario
        this.calendario = calendario; // El administrador ahora gestiona el calendario
        System.out.println("Gestionando calendario...");
    }
}