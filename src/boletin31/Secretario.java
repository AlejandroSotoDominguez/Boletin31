
package boletin31;

public class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, float salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
    }

    public Secretario(String despacho, String numeroFax, String nombre, String apellidos, String dni, String direccion, String telefono, float salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }
    
    @Override
    public void incrementarSalario(){
        float salario = (float)(super.getSalario()+0.05*super.getAñosAntiguedad());
        System.out.println(salario);
    }

    public String imprimir() {
        return  "nombre "+super.getNombre()+"apellidos "+super.getApellidos()+" Secretario{" + " despacho=" + despacho + ", numeroFax=" + numeroFax + '}';
    }

    
    
    
    
}
