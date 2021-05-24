package applistaempleados;

import java.util.List;
import java.util.Scanner;

public class AppListaEmpleados {

    static EmpleadoService service = new EmpleadoService();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        mostrarMenu();
    }

    static void mostrarDatosAscendente() {

        List<Empleado> lista = service.buscarTodo();

        lista.forEach((Empleado _item) -> {
            System.out.println(_item);
        });
    }

    static void mostrarDatosDescendente() {

        List<Empleado> lista = service.buscarTodo();

        for (int i = (lista.size() - 1); i > -1; i--) {
            System.out.println(lista.get(i));
        }
    }

    static void mostrarDatosTablas() {
        System.out.println("+------+------------+------------+------------+------+------------+----------------+----+----------+");
        System.out.println("|Nro de|  Apellido  |   Nombre   |  Telefono  |Genero|  Fecha de  |Inicio Actividad|Edad|Antiguedad|");
        System.out.println("|Legajo|            |            |            |      | Nacimiento |    Laboral     |    | Laboral  |");
        System.out.println("+------+------------+------------+------------+------+------------+----------------+----+----------+");
        List<Empleado> lista = service.buscarTodo();

        lista.forEach((Empleado _item) -> {
            System.out.println(_item.toStringTabla());
        });
    }

    static void mostrarMenu() {

        int opcion = 0;

        do {

            // Util.limpiarPantalla();
            if (opcion < 0 || opcion > 7) {
                System.out.println("\u001b[31m-----------------------------");
                System.out.println("\u001b[31m------ OPCION INVALIDA ------");
                System.out.println("\u001b[31m-----------------------------\n");
            }
            System.out.println("\nOpciones\n=====================");
            System.out.println("1) Orden Ascendente - 2) Orden Descendente" + " - 3) Ver como detalle\n"
                    + "4) Ver como tabla - 5) Añadir - 6) Modificar" + " - 7) Borrar - 0) Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("------ Listado de Empleados -------");
                    System.out.println("-----------------------------------");
                    mostrarDatosAscendente();
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    System.out.println("------ Listado de Empleados -------");
                    System.out.println("-----------------------------------");
                    mostrarDatosDescendente();
                    break;
                case 3:
                    System.out.println("-----------------------------------");
                    System.out.println("------ Listado de Empleados -------");
                    System.out.println("-----------------------------------");
                    mostrarDatosAscendente();
                    break;
                case 4:
                    System.out.println("-----------------------------------");
                    System.out.println("------ Listado de Empleados -------");
                    System.out.println("-----------------------------------");
                    mostrarDatosTablas();
                    break;
                case 5:
                    nuevoEmpleado();
                    break;
                default:
                    break;
            }
        } while (opcion != 0);

        System.out.println("Bye...");
    }

    static void nuevoEmpleado() {
        // Declarar y crear instancia de Empleado:
        Empleado empleado = new Empleado();
        String fechaStr;
        int dd, mm, aaaa;

        System.out.println("------------------------------------------------");
        System.out.println("----- Completar los campos del empleado --------");
        System.out.println("------------------------------------------------");
        System.out.print("Apellido: ");
        empleado.setSurname(scan.nextLine());
        System.out.print("Nombre: ");
        empleado.setName(scan.nextLine());
        System.out.print("Genero: ");
        empleado.setGender(scan.nextLine().charAt(0));
        System.out.print("Telefono: ");
        empleado.setTelefono(scan.nextLine());
        System.out.print("Fecha de Nacimiento(dd/mm/aaaa): ");
        fechaStr = scan.nextLine();
        dd = Integer.parseInt(fechaStr.split("/")[0]);
        mm = Integer.parseInt(fechaStr.split("/")[1]);
        aaaa = Integer.parseInt(fechaStr.split("/")[2]);
        empleado.setFechaNacimiento(new Fecha(dd, mm, aaaa));
        System.out.print("Fecha de Contratacion(dd/mm/aaaa): ");
        fechaStr = scan.nextLine();
        dd = Integer.parseInt(fechaStr.split("/")[0]);
        mm = Integer.parseInt(fechaStr.split("/")[1]);
        aaaa = Integer.parseInt(fechaStr.split("/")[2]);
        empleado.setFechaContratacion(new Fecha(dd, mm, aaaa));
        service.guardar(empleado);
    }

}
