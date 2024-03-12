/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel.pruebasoftware;

/**
 *
 * @author aanng
 */
public class Tablon {
    private String material;
    private float longitud;

    public Tablon(String material, float longitud) {
        this.material = material;
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public float getLongitud() {
        return longitud;
    }
}