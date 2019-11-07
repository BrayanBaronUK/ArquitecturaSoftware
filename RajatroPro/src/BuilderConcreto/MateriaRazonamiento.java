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
         System.out.println("matematicas");
    }
    

    @Override
    public void porcentajeMateria() {
        System.out.println("porcentaje");
    }

    @Override
    public void listaEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listaCriterios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
}
