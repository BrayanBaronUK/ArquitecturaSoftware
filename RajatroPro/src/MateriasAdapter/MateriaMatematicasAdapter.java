/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriasAdapter;

import BuilderConcreto.MateriaMatematicas;

/**
 *
 * @author 10 Spring Creators
 */
public class MateriaMatematicasAdapter extends MateriaAdapter{

   final MateriaMatematicas matematicas  = new MateriaMatematicas();

    @Override
    public void creacionAdapter() {
        matematicas.nombre();
        matematicas.listaCriterios();
        matematicas.listaEstudiantes();
        matematicas.porcentajeMateria();
    }
}
