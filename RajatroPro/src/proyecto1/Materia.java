/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;

/**
 *
 * @author Olaya
 */
public class Materia {

    double totalPorcentaje;
    String nombre;
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    ArrayList<Criterio> listaCriterios = new ArrayList<>();

    public Materia(String nombre) {
        this.nombre = nombre;
    }

}
