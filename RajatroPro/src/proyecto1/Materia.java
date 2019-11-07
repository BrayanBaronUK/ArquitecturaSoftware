/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;

/**
 *
 * @author Brayan
 */
public class Materia {

    double totalPorcentaje;
    String nombre;
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    ArrayList<Criterio> listaCriterios = new ArrayList<>();

    public void setTotalPorcentaje(double totalPorcentaje) {
        this.totalPorcentaje = totalPorcentaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void setListaCriterios(ArrayList<Criterio> listaCriterios) {
        this.listaCriterios = listaCriterios;
    }

   

    

}
