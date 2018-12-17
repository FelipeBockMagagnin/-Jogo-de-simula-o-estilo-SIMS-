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
public class InterfaceGrafica {
    void move(Movel movel, Posicao posDestino){
        if(movel instanceof Aquatico){
            //nada();
        } else if(movel instanceof Terrestre){
            //anda();
        } else if(movel instanceof Aereo){
            //voa();
        } else {
            //nao se move
        }
    }
    
    InterfaceGrafica(){
        int[][] mapa = new int[100][100];
        
    }
    
    void desenharMapa(){
        
    }
}

