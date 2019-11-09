/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriasAdapter;

import BuilderConcreto.MateriaSociales;

/**
 *
 * @author 10 Spring Creators
 */
public class MateriaSocialesAdapter extends MateriaAdapter{
    
   final MateriaSociales sociales = new MateriaSociales();

    @Override
    public void creacionAdapter() {
        sociales.nombre();
        sociales.listaCriterios();
        sociales.listaEstudiantes();
        sociales.porcentajeMateria();
    }
}
