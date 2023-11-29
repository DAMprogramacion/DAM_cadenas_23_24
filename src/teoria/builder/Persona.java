package teoria.builder;

public class Persona {
    private String apellidos;
    private String nombre;
    private String dni;
    private int edad;

    public Persona(String apellidos, String nombre, String dni, int edad) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   /* @Override
    public String toString() {
       return String.format
               ("%s,%s,%s,%d",dni, apellidos, nombre, edad);
    }*/

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(dni).append(',').append(apellidos).append(',');
        builder.append(nombre).append(',').append(edad);
        return builder.toString();
    }
}
