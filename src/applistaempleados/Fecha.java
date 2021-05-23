package applistaempleados;

import java.time.LocalDate;

/**
 *
 * @author pcc
 */
public class Fecha implements iFecha {

    //atributos
    private int dia;
    private int mes;
    private int anio;

    //metodo constructor
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //metodos
    @Override
    public int getDia() {
        return this.dia;
    }

    @Override
    public int getMes() {
        return this.mes;
    }

    @Override
    public int getAnio() {
        return this.anio;
    }

    @Override
    public int calcularAniosTranscurridos() {

        LocalDate fechaActual = LocalDate.now();
        int edad;
        int anioA = fechaActual.getYear(), mesA = fechaActual.getMonthValue(), diaA = fechaActual.getDayOfMonth();

        if (mesA < this.mes || (diaA < this.dia && mesA == this.mes)) {
            edad = anioA - this.anio - 1;
        } else {
            edad = anioA - this.anio;
        }

        return edad;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
