/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Brayan
 */
public class estudianteNoExisteException extends Exception {

    String nombreEstudiante;

    public estudianteNoExisteException(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    @Override
    public String getMessage() {
        return "" + nombreEstudiante;
    }
}
