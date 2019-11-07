/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author 10 Spring Creators
 */
public abstract class MateriaBuilder {
    
    protected Materia materia;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    public abstract void nombreMateria();
    public abstract void porcentajeMateria();
    public abstract void listaEstudiantes();
    public abstract void listaCriterios();
}
