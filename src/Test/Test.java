 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Dominio.Persona;
import Dominio.Empleado;
/**
 *
 * @author Alberto
 */
public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Oscar","Jimenez");
        Persona p2 = new Persona("Sergio","Lopez");
        Persona p3 = new Persona("Manuel","Gamez");
        Persona p4 = new Persona("Miguel","Caro");
        
        Integer[][] numeros = {{2, 4}, {2, 2}};
        
        Persona [][] todas = new Persona[2][2];
        todas[0][0] = p1;
        todas[0][1] = p2;
        todas[1][0] = p3;
        todas[1][1] = p4;
        
        /*
        for (int i = 0; i < todas.length; i++) {
            for (int j = 0; j < todas[i].length; j++) {
                System.out.println(todas[i][j]);
            }
        }
        */
        for (int i = 0; i < todas.length; i++) {
            if(i == 0)System.out.println("Socios: ");
            else System.out.println("\nDirectores: ");
            for (int j = 0; j < todas[i].length; j++) {
                System.out.println(todas[i][j]);
            }
        }
        
        System.out.println("");
        
        System.out.println("NUMEROS: ");
        imprimir(numeros[1]);
        System.out.println("EMPLEADOS: ");
        imprimir(todas[1]);
            
        System.out.println(""); 
        
        System.out.println("PRIMERA LLAMADA CON 3 arg: ");
        imprimirNumeros(1, 2, 4);
        System.out.println("SEGUNDA LLAMADA CON 2 arg: ");
        imprimirNumeros(3, 7);
        
    }
    
    public static void imprimir(Object lista[]){
        for (int i = 0; i < lista.length; i++) {    
            System.out.println("Lista: " + i + "Lista: " + lista[i]);
        }
    }
    
    
    public static void imprimirNumeros(int...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero --> [" + i + "] " + numeros[i]);
        }
    }
        
}

