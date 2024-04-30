public class Paciente {
    private String nombre;
    private int edad;
    private String tipoSangre;
    private String ultimaCita;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoSangre() {
        return this.tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getUltimaCita() {
        return this.ultimaCita;
    }

    public void setUltimaCita(String ultimaCita) {
        this.ultimaCita = ultimaCita;
    }

    public Paciente(String nombre, int edad, String tipoSangre, String ultimaCita) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoSangre = tipoSangre;
        this.ultimaCita = ultimaCita;
    }

   
}
