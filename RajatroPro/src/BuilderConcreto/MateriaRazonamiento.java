/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderConcreto;

import proyecto1.Materia;
import proyecto1.MateriaBuilder;

/**
 *
 * @author 10 Spring Creators
 */
public class MateriaRazonamiento extends MateriaBuilder{
    
            
            
     @Override
    public void nombre() {
        System.out.println("Matematicas");
          materia.toString();
    }
    

    @Override
    public void porcentajeMateria() {
        System.out.println("porcentaje");
    }

    @Override
    public void listaEstudiantes() {
       System.out.println("estudiantes");
    }

    @Override
    public void listaCriterios() {
       System.out.println("criterios");
    }

   
    
    
    
}
