import java.util.LinkedList;
import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList<>();
        LinkedList<Empleado> empleados = new LinkedList<>();
        

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            Empleado item = new Empleado(null, null, null, i, null);
            System.out.println("Ingrese el nombre");
            item.setNombre(sc.next());

            System.out.println("Ingrese el apellido");
            item.setApellido(sc.next());

            System.out.println("Ingrese el direccion");
            item.setDireccion(sc.next());

            System.out.println("Ingrese la edad");
            item.setEdad(sc.nextInt());

            System.out.println("Ingrese el cargo");
            item.setCargo(sc.next());

            



        }

        String cadena = "";

        for (Empleado empleado : empleados) {
            
            cadena = cadena + empleado.getNombre() + "\n" + empleado.getApellido() + "\n" + 
            empleado.getDireccion() + "\n" + empleado.getEdad() + "\n" + empleado.getCargo() + "\n";


        }

        System.out.println(empleados);
        
    }
    
}