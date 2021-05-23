package applistaempleados;

import java.util.List;

/**
 *
 * @author pcc
 */

public class EmpleadoService implements iEmpleadoService {

    EmpleadoRepository repo = new EmpleadoRepository();

    @Override
    public List<Empleado> buscarTodo() {
        return repo.getEmpleados();
    }

    @Override
    public List<Empleado> buscarPor(String criterio) {
        return repo.getEmpleados();
    }

    @Override
    public Empleado buscarPorLegajo(int nroLegajo) {
        System.out.println("n");
        Empleado emp = new Empleado();
        return emp;
    }

    @Override
    public void guardar(Empleado empleado) {
        repo.addEmpleado(empleado);
    }

    @Override
    public void borrar(Empleado empleado) {
        repo.deleteEmpleado(empleado);
    }

    @Override
    public void borrarPorId(int nroLegajo) {
        System.out.println("nada");
    }

}
