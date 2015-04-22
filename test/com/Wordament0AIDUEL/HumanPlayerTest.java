package com.Wordament0AIDUEL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Wordament0AIDUEL.GameLoop;
import com.Wordament0AIDUEL.Board;
import com.Wordament0AIDUEL.HumanPlayer;
import com.Wordament0AIDUEL.GameState;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import javax.swing.JPanel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nim_13512501
 */
public class HumanPlayerTest {
    
    public HumanPlayerTest() {
    }

    @Test
    public void testRun() throws InterruptedException {
        GameState gs = new GameState();
        GameState gspembanding = new GameState(gs);
        GameLoop gl = new GameLoop(gs);
        
        JPanel jp = new JPanel();
        HumanPlayer hp = new HumanPlayer(gl, jp);
        Thread hpThread = new Thread(hp);
        
        gl.start();
        hpThread.start();
        while (hpThread.isAlive())sleep(100); //menunggu hpThread berjalan
        KeyListener [] jpkl = jp.getKeyListeners();
        assertEquals(1,jpkl.length);
        KeyListener simkl = jpkl[0];
        
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_Q));
        gspembanding.MovePointer(Board.DIRUPLEFT);
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_W));
        gspembanding.MovePointer(Board.DIRUP);
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_E));
        gspembanding.MovePointer(Board.DIRUPRIGHT);
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_R));
        gspembanding.PutarBoard();
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_A));
        gspembanding.MovePointer(Board.DIRLEFT);
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_S));
        gspembanding.StartStopBuatKata();
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_D));
        gspembanding.MovePointer(Board.DIRRIGHT);
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_Z));
        gspembanding.MovePointer(Board.DIRDOWNLEFT);
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_X));
        gspembanding.MovePointer(Board.DIRDOWN);
        simkl.keyPressed(new KeyEvent(jp,KEY_PRESSED,1,0,VK_C));
        gspembanding.MovePointer(Board.DIRDOWNRIGHT);
        sleep(100);
        hpThread.interrupt();
        gl.interrupt();
        hpThread.join();
        gl.join();
        assertNotNull(gs.GetBoard());
        assertEquals(gspembanding.GetBoard(),gs.GetBoard());
        assertEquals(gspembanding.getKataTerbentuk(),gs.getKataTerbentuk());
        assertFalse(hpThread.isAlive());
        assertFalse(gl.isAlive());
        
    }

    @Test
    public void testSetGame() {
        GameLoop A = new GameLoop();
        HumanPlayer hp;
        hp = new HumanPlayer(A, new JPanel());
        GameLoop B = new GameLoop();
        hp.setGame(B);
        assertEquals(B,hp.getGameLoop());
    }
    
}
