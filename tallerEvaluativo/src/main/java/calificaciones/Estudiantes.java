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
public class Estudiantes {
    private String nombre;
    private int Documento;
    private ArrayList<Materia> mat;
   

    public Estudiantes(String nombre, int Documento) {
        setDocumento(Documento);
        setNombre(nombre);
        this.mat = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public ArrayList<Materia> getMat() {
        return mat;
    }

    public void setMat(ArrayList<Materia> mat) {
        this.mat = mat;
    }
    
    public void agregarMateria(Materia materias){
        mat.add(materias);
    }
    
    public boolean actualizarNota (String nombreMateria,double notaFinal ){
        for (int i = 0; i < mat.size(); i++) {
            if(mat.get(i).getNombre().equalsIgnoreCase(nombreMateria)){
                mat.get(i).setNotaFinal(notaFinal);
                return true;  
            } 
        } 
    return false;
    }
    public boolean eliminarMateria(String nombre){
        for (int i = 0; i < mat.size(); i++) {
            if(mat.get(i).getNombre().equals(nombre)){
                mat.remove(i);
                return true;
            
        }
        
        }
        return false;
    }
    
}