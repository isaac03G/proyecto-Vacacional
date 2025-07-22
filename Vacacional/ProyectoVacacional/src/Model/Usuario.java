package Model;

public abstract class Usuario {

    protected String nombre;
    protected int edad;
    protected int identificacion;
    protected int estrato;


    public Usuario(String nombre, int edad, int identificacion, int estrato) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.estrato = estrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", identificacion=" + identificacion + ", estrato=" + estrato + '}';
    }
}  