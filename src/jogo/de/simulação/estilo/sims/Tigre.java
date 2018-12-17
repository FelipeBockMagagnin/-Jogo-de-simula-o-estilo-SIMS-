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
public class Tigre extends Animal implements Terrestre{

    @Override
    public void anda(Posicao pos) {
        System.out.println("Tigre andando de " + this.pos.x + "," + this.pos.y + "para " + pos.x + "," + pos.y);
        this.pos = pos;
    }
    
}
