/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import modelo.Consulta;
import daos.DaoConsulta;
import java.time.LocalDate;
import modelo.Veterinario;
/**
 *
 * @author Kevin 
 */

public class ConsultaControlador {

    private DaoConsulta dao;
    private Veterinario veterinario;
    public ConsultaControlador() {
        this.dao = new DaoConsulta();
    }

    public boolean registrarConsulta(String codigo, String fechaTexto) {
        // Validar que el código y la fecha no estén vacíos
        if (codigo == null || codigo.isBlank() || fechaTexto == null || fechaTexto.isBlank()) {
            return false;
        }
        // Validar formato de fecha (YYYY-MM-DD)
        if (!fechaTexto.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }
        // Crear consulta usando setters validados en la clase modelo
        Consulta c = new Consulta(codigo, fechaTexto, veterinario);
        return dao.guardarConsulta(c);
    }

    public Consulta buscarConsulta(Consulta consulta) {
        if (consulta.getCodigo() == null || consulta.getCodigo().isBlank()) {
            return null;
        }
        return dao.buscarConsulta(consulta);
    }

    public boolean eliminarConsulta(Consulta consulta) {
        if (consulta.getCodigo() == null || consulta.getCodigo().isBlank()) {
            return false;
        }
        Consulta c = dao.buscarConsulta(consulta);
        if (c != null) {
            return dao.eliminarConsulta(consulta);
        }
        return false;
    }

  public boolean editarConsulta(String codigo, String nuevaFechaTexto, Veterinario nuevoVeterinario) {
    if (codigo == null || codigo.isBlank() || nuevaFechaTexto == null || nuevaFechaTexto.isBlank() || nuevoVeterinario == null) {
        return false;
    }

    if (!nuevaFechaTexto.matches("\\d{4}-\\d{2}-\\d{2}")) {
        return false;
    }

    try {
        Consulta nuevaConsulta = new Consulta(codigo, nuevaFechaTexto, nuevoVeterinario);
        return dao.editarConsulta(nuevaConsulta);
    } catch (IllegalArgumentException e) {
        return false;
    }
  }
}


