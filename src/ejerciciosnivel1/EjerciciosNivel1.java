/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel1;

/**
 *
 * @author ged20
 */
public class EjerciciosNivel1 {

    //decalraro un array de ints para hacer pruebas
    int[] listaNumeros = {50, 31, 27, 2, 5, 99};

    public int maximo(int[] lista) {
        int auxiliar = lista[0]; //el máximo va a ser el primer elemento del array

        for (int i = 0; i < lista.length; i++) {
            if (auxiliar < lista[i]) {
                auxiliar = lista[i];
            }
        }
        return auxiliar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EjerciciosNivel1 ejercicio = new EjerciciosNivel1();
        
        System.out.println("el maximo es: " + ejercicio.maximo(ejercicio.listaNumeros));

    }

}
