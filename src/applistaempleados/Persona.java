package applistaempleados;

public class Persona {

    //Atributos de clase
    private String surname;
    private String name;
    private char gender;
    private Fecha fechaNacimiento;

    //Constructor por defecto:
    public Persona() {
    }

    //Constructor con parametros
    //Metodo sobrecargado
    public Persona(String _surname, String _name, char _gender, Fecha _fechaNacimiento) {
        this.surname = _surname;
        this.name = _name;
        this.gender = _gender;
        this.fechaNacimiento = _fechaNacimiento;
    }

    //Metodos de clase
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.name + "\nApellido: " + this.surname
                 + "\nGenero: " + this.gender
                 + "\nFecha de Nacimiento: " + this.fechaNacimiento
                 + "\nEdad: " + fechaNacimiento.calcularAniosTranscurridos() + " anios.";
    }
    
}
