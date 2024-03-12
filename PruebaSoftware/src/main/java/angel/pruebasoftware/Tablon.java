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

    // Constructor
    public Tablon(String material, float longitud) {
        this.material = material;
        this.longitud = longitud;
    }

    // Métodos de acceso (getters y setters)
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
}