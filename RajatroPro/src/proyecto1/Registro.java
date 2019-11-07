/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Brayan
 */
public class Registro {

    int contador2 = 0;
    int contador3 = 0;
    static double NOTAFINAL = 0;
    static double PROMEDIO = 0;

    ArrayList<Materia> materias = new ArrayList<>();
    Estudiante estudiante;
    Materia materia;
    Criterio criterio;

//    public void crearMateria(String Curso) {
//        materia = new Materia(Curso);
//        materias.add(materia);
//    }

    public void crearEstudiante(String MateriaEstudiante, String NombreAgregar) throws materiaNoExisteException {
        int contador = 0;
        for (int i = 0; i < materias.size(); i++) {
            if (MateriaEstudiante.equals(materias.get(i).nombre)) {
                contador++;
            }
        }
        if (contador > 0) {
            estudiante = new Estudiante(NombreAgregar);
            materia.listaEstudiantes.add(estudiante);
        }
        if (contador == 0) {
            throw new materiaNoExisteException(MateriaEstudiante);
        }

    }

    void agregarElemento(String NombreElemento, String MateriaElemento, double Porcentaje) throws materiaNoExisteException {
        int contador = 0;
        for (int i = 0; i < materias.size(); i++) {
            if (MateriaElemento.equals(materias.get(i).nombre)) {
                contador++;
            }
        }
        if (contador > 0) {
            criterio = new Criterio(NombreElemento, Porcentaje);
            materia.listaCriterios.add(criterio);
        }
        if (contador == 0) {
            throw new materiaNoExisteException(MateriaElemento);
        }

    }

    void evaluarEstudiante(String ElementoCaificar, String MateriaCalificar, String EstudianteCalificar, double nota) throws materiaNoExisteException {
        int contador1 = 0;
        double nota2 = 50;

        for (int i = 0; i < materias.size(); i++) {
            if (MateriaCalificar.equals(materias.get(i).nombre)) {
                contador1++;
                try {
                    bucarEstudiante(materias.get(i), EstudianteCalificar);
                } catch (estudianteNoExisteException ex) {
                    JOptionPane.showMessageDialog(null, "El estudiante " + ex.getMessage() + " no está inscrito en este curso");

                }
                try {
                    buscarCriterio(materias.get(i), ElementoCaificar);
                } catch (criterioNoExisteException ex) {
                    JOptionPane.showMessageDialog(null, "El criterio " + ex.getMessage() + " no existe.");
                }
            }

        }

        if (contador1 == 0) {
            throw new materiaNoExisteException(MateriaCalificar);
        }
        if (contador1 > 0 && contador2 > 0 && contador3 > 0) {
            double notaCalculada = 0;
            double notaComparativa = 0;
            for (int i = 0; i < materia.listaCriterios.size(); i++) {
                if (ElementoCaificar.equals(materia.listaCriterios.get(i).nombre)) {
                    notaCalculada = (nota * (materia.listaCriterios.get(i).porcentaje / 100));
                    notaComparativa = (nota2 * (materia.listaCriterios.get(i).porcentaje / 100));
                }
            }

            for (int i = 0; i < materia.listaEstudiantes.size(); i++) {
                if (EstudianteCalificar.equals(materia.listaEstudiantes.get(i).nombre)) {
                    Nota notaAsignar = new Nota(ElementoCaificar, notaCalculada);
                    notaIdeal NotaIdeal = new notaIdeal(notaComparativa);
                    materia.listaEstudiantes.get(i).notas.add(notaAsignar);
                    materia.listaEstudiantes.get(i).notasIdealea.add(NotaIdeal);
                }
            }

        }

    }

    private void bucarEstudiante(Materia materia, String EstudianteCalificar) throws estudianteNoExisteException {
        for (int i = 0; i < materia.listaEstudiantes.size(); i++) {
            if (EstudianteCalificar.equals(materia.listaEstudiantes.get(i).nombre)) {
                contador2++;
            }
        }
        if (contador2 == 0) {
            throw new estudianteNoExisteException(EstudianteCalificar);
        }
    }

    private void buscarCriterio(Materia materia, String ElementoCaificar) throws criterioNoExisteException {
        for (int i = 0; i < materia.listaCriterios.size(); i++) {
            if (ElementoCaificar.equals(materia.listaCriterios.get(i).nombre)) {

                contador3++;
            }
        }
        if (contador3 == 0) {
            throw new criterioNoExisteException(ElementoCaificar);
        }
    }

    void DarNotaFinal(String NombreNota, String MateriaNota) throws materiaNoExisteException {
        int contador = 0;
        for (int i = 0; i < materias.size(); i++) {
            if (MateriaNota.equals(materias.get(i).nombre)) {
                contador++;
                buscarEstudianteParaAsiganrNota(NombreNota, materias.get(i));
            }
            if (contador == 0) {
                throw new materiaNoExisteException(MateriaNota);
            }
        }

    }

    private void buscarEstudianteParaAsiganrNota(String NombreNota, Materia materia) {
        int contador = 0;
        for (int i = 0; i < materia.listaEstudiantes.size(); i++) {
            if (NombreNota.equals(materia.listaEstudiantes.get(i).nombre)) {
                notaAsignada(materia.listaEstudiantes.get(i));
            }
        }

    }

    void DarInformacionFinal(String MateriaPromedio) {
        int contador = 0;

        for (int i = 0; i < materias.size(); i++) {
            if (MateriaPromedio.equals(materias.get(i).nombre)) {
                contador++;
                darPromedio(materias.get(i));
            }
        }
        if (contador == 0) {
            System.out.println("Algo está mal");
        }
    }

    private void darPromedio(Materia materia) {
        double promedio = 0;
        for (int i = 0; i < materia.listaEstudiantes.size(); i++) {
            promedio += materia.listaEstudiantes.get(i).calculaNota();

        }
        PROMEDIO = (promedio / materia.listaEstudiantes.size());
    }

    private void notaAsignada(Estudiante estudiante) {
        NOTAFINAL = estudiante.calculaNota();
    }

}
