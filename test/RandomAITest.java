/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Thread.sleep;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nim_13512501
 */
public class RandomAITest {
    
    public RandomAITest() {
    }

    @Test
    public void testGetSetGameLoop() {
        GameLoop A = new GameLoop();
        RandomAI RAI = new RandomAI(A);
        GameLoop B = new GameLoop();
        RAI.setGame(B);
        assertEquals(B,RAI.getGameLoop());
    }

    @Test
    public void testRun() throws InterruptedException {
        GameState GS = new GameState();
        GameLoop A = new GameLoop();
        RandomAI RAI = new RandomAI(A);
        A.start();
        Thread RAIThread = new Thread(RAI);
        RAIThread.start();
        sleep(1000);
        RAIThread.interrupt();
        A.interrupt();
        assertNotNull(GS.GetBoard());
    }
    
}
