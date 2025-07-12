/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calificaciones;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Materia {
    private String nombre;
    private double notaFinal;
   

    public Materia(String nombre, double notaFinal) {
        setNombre(nombre);
        setNotaFinal(notaFinal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
