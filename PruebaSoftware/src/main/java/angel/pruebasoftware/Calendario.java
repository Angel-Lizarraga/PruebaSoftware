/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel.pruebasoftware;

/**
 *
 * @author aanng
 */
import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private List<Evento> eventos;

    // Constructor
    public Calendario() {
        this.eventos = new ArrayList<>();
    }

    // Método para agregar un evento al calendario
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Método para eliminar un evento del calendario
    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
    }

    // Método para consultar todos los eventos del calendario
    public List<Evento> consultarEventos() {
        return eventos;
    }
}