
package arrays_ejemplo;

import java.util.ArrayList;

public class Arrays_Ejemplo {

    public static void main(String[] args) {
        
        String [] materias = new String[5];
        System.out.println("longitud = "+materias.length);
        materias [0] = "Estructura de datos";
        materias [1] = "Base de datos";
        materias [2] = "Programacion orientada a objetos";
        materias [3] = "Programacion web";
        materias [4] = "Ensamblador y compiladores";
        System.out.println("elemento[0]"+ materias[0]);
        System.out.println("elemento[1]"+ materias[1]);
        System.out.println("elemento[2]"+ materias[2]);
        System.out.println("elemento[3]"+ materias[3]);
        System.out.println("elemento[4]"+ materias[4]);
        
        int [] ejemplo2 = {1,2,3,4,5};
        System.out.println("longitud = "+ejemplo2.length);
        System.out.println("elemento[0]"+ ejemplo2[0]);
        System.out.println("elemento[1]"+ ejemplo2[1]);
        System.out.println("elemento[2]"+ ejemplo2[2]);
        System.out.println("elemento[3]"+ ejemplo2[3]);
        System.out.println("elemento[4]"+ ejemplo2[4]);
        
        float [] costos = new float[3];
        System.out.println("longitud = " + costos.length);
        costos[0] = (float) 12.7;
        costos[1] = (float) 25.3;
        costos[2] = (float) 65.2;
        System.out.println("elemento [0]" + costos[0]);
        System.out.println("elemento [1]" + costos[1]);
        System.out.println("elemento [2]" + costos[2]);
        
        float[] precios = {(float)26.78, (float)25,98, (float)542.56};
        System.out.println("longitud 0 " + precios.length);
        System.out.println("elemento [0]" + precios[0]);
        System.out.println("elemento [1]" + precios[1]);
        System.out.println("elemento [2]" + precios[2]);
        
        ArrayList<Prueba> p1 = new ArrayList<Prueba>();
        
        Prueba prueba1 = new Prueba(1,"AC");
        p1.add(prueba1);
        
        Prueba prueba2 = new Prueba(2, "BA");
        p1.add(prueba2);
        
        Prueba prueba3 = new Prueba(3, "PR");
        p1.add(prueba3);
        
        System.out.println("longitud de arreglo de objetos: " + p1.size());
        
        System.out.println("datos del objeto 1: " + p1.get(0).getEstatus());
    }
    
}
