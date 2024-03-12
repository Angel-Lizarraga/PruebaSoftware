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

    public Calendario() {
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
        System.out.println("Evento agregado al calendario: " + evento.getNombre());
    }

    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
        System.out.println("Evento eliminado del calendario: " + evento.getNombre());
    }

    public List<Evento> consultarEventos() {
        return eventos;
    }
}