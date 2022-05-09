/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class ejecutor02 {

    public static void main(String[] args) {
        // 1. crear una persona del barrio el valle de la ciudad de loja
        // 2. crear una persona del barrio central de la ciudad de cuenca
        // 3. crear una persona del barrio centenario de la ciudad de guayaquil
        
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio1 = new Barrio("El Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);
        
        Persona persona1 = new Persona("David Carrion", "1100909909", barrio1);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        Persona persona2 = new Persona("Pablo Costa", "1100909909", barrio2);
        
        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        Persona persona3 = new Persona("Ronin Carrion", "1100909909", barrio3);
        
        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
    }
    }


