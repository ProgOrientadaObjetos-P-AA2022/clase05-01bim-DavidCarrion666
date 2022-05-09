/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejecutor03 {

    public static void main(String[] args) {
        // se crea un de tipo UnidadDVD

        String procesador = "M1";
        String marca = "Vaio";
        double costo = 39.99;       
        UnidadDVD unidad = new UnidadDVD(marca, costo);
        
        Computadora computadora = new Computadora(procesador, unidad);

        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n"
                + "Costo de Unidad DVD: %.2f\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca(),
                computadora.obtenerUnidadDvd().obtenerCosto());

    }

}
