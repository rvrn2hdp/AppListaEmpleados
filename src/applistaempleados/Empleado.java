package applistaempleados;

public class Empleado extends Persona {

    //Atributos
    private int nroLegajo;
    private String telefono;
    private Fecha fechaContratacion;

    //Constructores
    public Empleado() {
    }

    public Empleado(String apellido, String nombre,
            char genero, Fecha fechaNacimiento,
            String telefono, Fecha fechaContratacion) {
        setSurname(apellido);
        setName(nombre);
        setGender(genero);
        setFechaNacimiento(fechaNacimiento);
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;
    }

    //Metodos
    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Fecha getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Fecha fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String toStringTabla() {
        return     "|"+this.nroLegajo
                +"     "+"|"+getSurname()
                +"   "+"|"+getName()
                +"   "+"|"+this.telefono
                +"   "+"|"+(getGender() == 'M' ? "Hombre" : "Mujer")
                +" "+"|"+getFechaNacimiento()
                +" "+"|"+this.fechaContratacion
                +"  "+"|"+getFechaNacimiento().calcularAniosTranscurridos()
                +"  "+"|"+getFechaContratacion().calcularAniosTranscurridos()+"\t|";
    }

    @Override
    public String toString() {
        return "\nNro. de Legajo: " + this.nroLegajo
                + "\nEmpleado: " + getSurname() + ", " + getName()
                + "\nTelefono: " + this.telefono
                + "\nSexo: " + (getGender() == 'M' ? "Hombre" : "Mujer")
                + "\nNacido en: " + getFechaNacimiento()
                + "\nInicio de Actividad laboral: " + this.fechaContratacion
                + "\nEdad: " + getFechaNacimiento().calcularAniosTranscurridos()
                + "\nAntiguedad laboral: " + getFechaContratacion().calcularAniosTranscurridos();
    }
}
