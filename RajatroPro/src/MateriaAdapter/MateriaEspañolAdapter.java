/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriaAdapter;
import BuilderConcreto.MateriaEspañol;
/**
 *
 * @author 10 Spring Creators
 */
public class MateriaEspañolAdapter extends MateriaAdapter{
    
    final MateriaEspañol español = new MateriaEspañol();

    @Override
    public void creacionAdapter() {
        español.nombre();
        español.listaCriterios();
        español.listaEstudiantes();
        español.porcentajeMateria();
    }
    
}
