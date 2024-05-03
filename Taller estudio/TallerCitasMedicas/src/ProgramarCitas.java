import java.util.LinkedList;

public class ProgramarCitas {

    String Cadena=null;

    public String mostrarFormulario(LinkedList<Paciente> pacientes, String Cadena) {
        System.out.println("\nFormulario de pacientes:");
        for (Paciente paciente : pacientes) {
            System.out.println("Nombre: " + paciente.getNombre());
            System.out.println("Edad: " + paciente.getEdad());
            System.out.println("Tipo de sangre: " + paciente.getTipoSangre());
            System.out.println("Ultima cita: " + paciente.getUltimaCita());
            System.out.println();
        }
        return Cadena;
    }


}
