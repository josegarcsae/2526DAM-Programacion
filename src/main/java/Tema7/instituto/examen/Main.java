package Tema7.instituto.examen;

import Tema7.instituto.examen.datos.EscritorInforme;
import Tema7.instituto.examen.datos.LectorCSV;
import Tema7.instituto.examen.datos.PeonadaDAO;
import Tema7.instituto.examen.modelo.Peonada;
import Tema7.instituto.examen.modelo.ResumenEmpleado;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Leemos de un fichero y lo guardamos en una lista
        List<Peonada> peonadas = LectorCSV.leer();

        // Guardamos esa lista en base de datos
        PeonadaDAO.guardaEnBD(peonadas);

        // Procesamos el trabajo de todos los empleados
        List<ResumenEmpleado> resumenesEmpleados = PeonadaDAO.consultaInformacion();

        // Generamos el informe final
        EscritorInforme.imprimeInformacion(resumenesEmpleados);

    }


}
