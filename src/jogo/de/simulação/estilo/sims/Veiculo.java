/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.de.simulação.estilo.sims;

import java.util.ArrayList;

/**
 *
 * @author Felpi
 */
public abstract class Veiculo implements Movel{
    protected Posicao pos;
    
    ArrayList<String> registros = new ArrayList();
    
    void registra(Posicao origem, Posicao destino){
        registros.add("Posição origem: " + origem + "Posição destino: " + destino);
    }
}
