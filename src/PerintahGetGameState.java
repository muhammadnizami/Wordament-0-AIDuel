/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Mengambil Gamestate dan mengcopynya ke GS
 */
public class PerintahGetGameState {
    /*Atribut*/
    private GameState GS = null;
    /*Method*/
    public synchronized void execute(GameState _GS){
        GS = new GameState(_GS);
        this.notify();
    }
    public synchronized GameState getGS() throws InterruptedException{
        this.wait();
        return GS;
    }
}
