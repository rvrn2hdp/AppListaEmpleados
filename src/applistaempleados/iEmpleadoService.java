/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaempleados;

import java.util.List;
/**
 *
 * @author pcc
 */
public interface iEmpleadoService {
    public List<Empleado> buscarTodo();
    public List<Empleado> buscarPor(String criterio);
    public Empleado buscarPorLegajo(int nroLegajo);
    public void guardar(Empleado empleado);
    public void borrar(Empleado empleado);
    public void borrarPorId(int nroLegajo);
}
