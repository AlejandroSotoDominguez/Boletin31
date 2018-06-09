
package boletin31;

public abstract class Empleado {
    private String nombre,apellidos,dni,direccion;
    private int añosAntiguedad;
    private String telefono;
    private float salario;
    private String supervisor;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, float salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
    

    public String imprimir() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion + ", a\u00f1osAntiguedad=" + añosAntiguedad + ", telefono=" + telefono + ", salario=" + salario + ", supervisor=" + supervisor + '}';
    }
    
    public void cambiarSupervisor(){
        
    }
    
    public void incrementarSalario(){
        
    }
    
}
