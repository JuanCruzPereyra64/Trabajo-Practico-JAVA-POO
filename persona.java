import org.w3c.dom.ls.LSOutput;

public class persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int anio_nacimiento;
    private String pais;
    private String genero;

    public persona(String nombre, String apellido, int dni, int anio_nacimiento, String pais, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anio_nacimiento = anio_nacimiento;
        this.pais = pais;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostar_datos(){
        System.out.println("Nombre: " + nombre + " " + apellido + " DNI: " + dni + " Año de nacimiento: " + anio_nacimiento + " Pais: " + pais + " Género: " + genero);
    }
}

