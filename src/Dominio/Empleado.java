/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Alberto
 */
public class Empleado extends Persona{
    private int numSegSocial;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos) {
        super(nombre, apellidos);
        this.numSegSocial = numSegSocial;
    }

    public int getNumSegSocial() {
        return numSegSocial;
    }

    public void setNumSegSocial(int numSegSocial) {
        this.numSegSocial = numSegSocial;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numSegSocial=" + numSegSocial + super.toString()+'}';
    }
    
    
    
    
}
