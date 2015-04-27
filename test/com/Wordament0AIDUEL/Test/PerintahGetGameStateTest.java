package com.Wordament0AIDUEL.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Wordament0AIDUEL.GameState;
import com.Wordament0AIDUEL.GameState;
import com.Wordament0AIDUEL.Perintah;
import com.Wordament0AIDUEL.Perintah;
import com.Wordament0AIDUEL.PerintahGetGameState;
import com.Wordament0AIDUEL.PerintahGetGameState;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nim_13512501
 */
public class PerintahGetGameStateTest {
    
    public PerintahGetGameStateTest() {
    }

    @Test
    public void testLangsungTereksekusi() throws Exception{
        System.out.println("execute");
        GameState _GS = new GameState();
        PerintahGetGameState instance = new PerintahGetGameState();
        instance.execute(_GS);
        assertEquals(_GS.GetBoard(),instance.getGS().GetBoard());
        assertEquals(_GS.getKataTerbentuk(),instance.getGS().getKataTerbentuk());
    }
    
    private class executeThread extends Thread{
        int sleepTime;
        Perintah p;
        GameState GS;
        public executeThread(int _sleepTime, Perintah _p, GameState _GS){
            sleepTime = _sleepTime;
            p = _p;
            GS = _GS;
        }
        @Override
        public void run(){
            try{
                sleep(sleepTime);
            }catch(InterruptedException e){
                //do nothing
            }
            p.execute(GS);
        }
    }

    @Test
    public void testTereksekusiNanti() throws Exception {
        System.out.println("testTereksekusiNanti");
        GameState _GS = new GameState();
        PerintahGetGameState instance = new PerintahGetGameState();
        executeThread a = new executeThread(1000,instance,_GS);
        a.start();
        GameState res = instance.getGS();
        assertEquals(_GS.GetBoard(),res.GetBoard());
        assertEquals(_GS.getKataTerbentuk(),res.getKataTerbentuk());
        assertEquals(_GS.getKataTerbentuk(),instance.getGS().getKataTerbentuk());
    }
    
        @Test
    public void testRacing() throws Exception {
        System.out.println("testRacing");
        GameState _GS = new GameState();
        PerintahGetGameState instance = new PerintahGetGameState();
        executeThread a = new executeThread(0,instance,_GS);
        a.start();
        GameState res = instance.getGS();
        assertEquals(_GS.GetBoard(),res.GetBoard());
        assertEquals(_GS.getKataTerbentuk(),res.getKataTerbentuk());
        assertEquals(_GS.getKataTerbentuk(),instance.getGS().getKataTerbentuk());
    }
    
}
