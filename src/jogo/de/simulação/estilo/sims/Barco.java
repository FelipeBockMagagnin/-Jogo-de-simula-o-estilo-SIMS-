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
public class Barco extends Veiculo implements Aquatico{

    @Override
    public void nada(Posicao pos) {
        System.out.println("Barco nadando de " + this.pos.x + "," + this.pos.y + "para " + pos.x + "," + pos.y);
        this.pos = pos;
    }
    
}
