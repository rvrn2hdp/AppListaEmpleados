package applistaempleados;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository {
    
    private List<Empleado> empleados;
    
    public EmpleadoRepository() {
        empleados = new ArrayList<>();
        
        //crear 2 instancias en memoria para test
        Empleado e1, e2;
        
        //Uno con Getters & Setters...
        e1 = new Empleado();
        e1.setSurname("Velazco");
        e1.setName("Alejandro");
        e1.setGender('M');
        e1.setFechaNacimiento(new Fecha(20,5,1992));
        e1.setTelefono("3624111111");
        e1.setFechaContratacion(new Fecha(26, 7, 2019));
        
        //otro con constructor sobrecargado...
        e2 = new Empleado("Gualtieri", "Elian", 'M',
                        new Fecha(2,2,2001),
                        "3624222222",
                        new Fecha(10, 10, 2018));
        
        //Añadirlos al array:
        addEmpleado(e1);
        addEmpleado(e2);        
    }
    
    public List<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void addEmpleado(Empleado empleado) {
        //incrementar el id si es necesario:
        if(empleado.getNroLegajo()==0) empleado.setNroLegajo(empleados.size()+1);
        empleados.add(empleado);
    }
    
    public void deleteEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }
}
