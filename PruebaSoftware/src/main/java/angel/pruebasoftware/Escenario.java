/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel.pruebasoftware;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aanng
 */
public class Escenario {
    private String nombre;
    private String ubicacion;
    private int capacidad;
    private List<Tablon> tablones;

    public Escenario(String nombre, String ubicacion, int capacidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.tablones = new ArrayList<>();
    }
}