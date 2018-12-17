/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.de.simulação.estilo.sims;

/**
 *
 * @author Felpi
 */
public class Passaro extends Animal implements Aereo{

    @Override
    public void voa(Posicao pos) {
        System.out.println("Passaro voando de " + this.pos.x + "," + this.pos.y + ", para " + pos.x + "," + pos.y);
        this.pos = pos;
    }
    
}
