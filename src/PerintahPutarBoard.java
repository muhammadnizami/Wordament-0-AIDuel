/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * ini adalah perintah yang dikirimkan ke gameloop untuk memutar board gamestate
 */
public class PerintahPutarBoard implements Perintah{
    
    @Override
    public void execute(GameState GS){
        GS.PutarBoard();
    }
}
