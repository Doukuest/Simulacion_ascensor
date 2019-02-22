/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @author Usuario
 */
public class Persona {
    private final int pisoDestino;
    private final double peso;
    private final double pesoPromedioRegion = 67.9;

    public Persona(int pisoDestino, double peso) {
        this.pisoDestino = pisoDestino;
        this.peso = peso*pesoPromedioRegion;
        if (this.peso<0){
            this.peso*=-1;
        }
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    public double getPeso() {
        return peso;
    }
    
    
}
