/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriasAdapter;
import BuilderConcreto.MateriaEspañol;

/**
 *
 * @author Brayan
 */
public class MateriaEspañolAdapter extends MateriaAdapter {
    
    final MateriaEspañol español = new MateriaEspañol();

    @Override
    public void creacionAdapter() {
        español.nombre();
        español.listaCriterios();
        español.listaEstudiantes();
        español.porcentajeMateria();
    }
    
}
