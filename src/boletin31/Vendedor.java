
package boletin31;

import java.util.ArrayList;

public class Vendedor extends Empleado {
    private Coche coche;
    private String telefono;
    private String area;
    private ArrayList<String>listaClientes;
    private int procentaje;

    public Vendedor(Coche coche, String area, int procentaje, String nombre, String apellidos, String dni, String direccion, String telefono, float salario) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.coche = coche;
        this.telefono = telefono;
        this.area = area;
        this.listaClientes = listaClientes;
        this.procentaje = procentaje;
    }

    @Override
    public void incrementarSalario(){
        float salario = (float)(super.getSalario()+0.1*super.getAñosAntiguedad());
        System.out.println(salario);
    }

    public String imprimir() {
        return "Vendedor{" + "coche=" + coche + ", telefono=" + telefono + ", area=" + area + ", listaClientes=" + listaClientes + ", procentaje=" + procentaje + '}';
    }
    
    public void altaCliente(String cliente){
        listaClientes.add(cliente);
    }
    
    public void bajaCliente(String cliente){
        listaClientes.remove(cliente);
    }
    
    public void cambiarCoche(Coche nuevoCoche){
        coche = nuevoCoche;
    }
    
}
