
package boletin31;

import java.util.ArrayList;

public class Boletin31 {

    public static void main(String[] args) {
        
        ArrayList<Empleado> listaEmpleados = new ArrayList();
        
        Empleado secretario = new Secretario("Pepe","Rodríguez","34223634S","Nuestra Señora de Fátima","673526374",950);
        Empleado vendedor = new Vendedor(new Coche("723467","Toyota","Verso"),"B",34,"Pepe","Rodríguez","34223634S","Nuestra Señora de Fátima","673526374",950);
        Empleado jefeZona = new JefeZona("despacho",new Secretario("Miguel","Martínez","23426245J","García Barbón","673482647",750),new Coche("35146","Peugeot","306"),"Adrián","Rodríguez","36234134M","Torrecedeira","667264823",1200);
    
        listaEmpleados.add(secretario);
        listaEmpleados.add(vendedor);
        listaEmpleados.add(jefeZona);
        
        secretario.incrementarSalario();
        vendedor.incrementarSalario();
        jefeZona.incrementarSalario();
  
        System.out.println(secretario.imprimir());
        System.out.println(vendedor.imprimir());
        System.out.println(jefeZona.imprimir());
    }
    
}
