/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Mengambil Gamestate dan mengcopynya ke GS
 */
public class PerintahGetGameState implements Perintah {
    /*Atribut*/
    private GameState GS = null;
    boolean executed = false;
    /*Method*/
    @Override
    public synchronized void execute(GameState _GS){
        GS = new GameState(_GS);
        
        //memberi tahu
        executed = true;
        this.notify();
    }
    public synchronized GameState getGS() throws InterruptedException{
        while (!executed)
            this.wait();
        return GS;
    }
}
