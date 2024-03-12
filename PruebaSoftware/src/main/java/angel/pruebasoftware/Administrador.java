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
    private String email;

    public Administrador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

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
}