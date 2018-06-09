
package boletin31;

import java.util.ArrayList;

public class JefeZona extends Empleado {
    private String despacho;
    private Secretario secretario;
    private ArrayList<Vendedor> listaVendedores;
    private Coche coche;

    public JefeZona(String despacho, Secretario secretario, Coche coche, String nombre, String apellidos, String dni, String direccion, String telefono, float salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.coche = coche;
    }
    
    @Override
    public void incrementarSalario(){
        float salario = (float)(super.getSalario()+0.2*super.getAñosAntiguedad());
        System.out.println(salario);
    }

    public String imprimir() {
        return "JefeZona{" + "despacho=" + despacho + ", secretario=" + secretario + ", vendedores=" + listaVendedores + ", coche=" + coche + '}';
    }

    public void cambiarSecretario(Secretario nuevoSecretario){
        secretario=nuevoSecretario;
    }    
    
    public void cambiarCoche(Coche nuevoCoche){
        coche=nuevoCoche;
    }
    
    public void altaVendedor(Vendedor nuevoVendedor){
        listaVendedores.add(nuevoVendedor);
    }
    
    public void bajaVendedor(Vendedor eliminarVendedor){
        listaVendedores.remove(eliminarVendedor);
    }
}
