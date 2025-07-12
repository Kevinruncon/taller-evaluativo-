/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerevaluativo;

import calificaciones.Estudiantes;
import calificaciones.Materia;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class TallerEvaluativo {

    public static void main(String[] args) {

  Scanner Scanner = new Scanner(System.in);

        // === Registro del Propietario ===
        System.out.println("=== Registro del estudiante ===");
        System.out.print("Nombre: ");
        String nombreEst = Scanner.nextLine();

        System.out.print("Documento: ");
        String documento = Scanner.nextLine();

        Estudiantes est = new Estudiantes(nombreEst, Integer.valueOf(documento));
        
        System.out.print("\n¿Cuántas materias desea registrar?: ");
        int numeroMaterias = Integer.parseInt(Scanner.nextLine());

        int i = 1;
        do {
            System.out.println("\n--- Materia #" + i + " ---");

            System.out.print("Nombre de la Materia: ");
            String nombreMateria = Scanner.nextLine();

            System.out.print("nota final: ");
            String notaFinal = Scanner.nextLine();


            Materia mat = new Materia(nombreMateria, Double.parseDouble(notaFinal));
            est.agregarMateria(mat);

            i++;
        } while (i <= numeroMaterias);

        // === Mostrar toda la información al final ===
        System.out.println("\n===== Promedio de notas =====");
//        propietario.mostrarInformacionCompleta();// Info del dueño
        

        Scanner.close(); // Cerrar el scanner
    }
}
