/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Wordament0AIDUEL.GameLoop;
import com.Wordament0AIDUEL.Board;
import com.Wordament0AIDUEL.GameState;
import com.Wordament0AIDUEL.PerintahGetGameState;
import com.Wordament0AIDUEL.PerintahStartStopBuatKata;
import com.Wordament0AIDUEL.PerintahPutarBoard;
import com.Wordament0AIDUEL.PerintahMovePointer;
import static java.lang.Thread.sleep;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nim_13512501
 */
public class GameLoopTest {
    
    public GameLoopTest() {
    }

    @Test
    public void testRun() throws InterruptedException {
        System.out.println("run");
        GameState target = new GameState();
        GameState pembanding = new GameState(target);
        GameLoop instance = new GameLoop(target);
        instance.start();
        
        instance.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRDOWN));
        pembanding.MovePointer(Board.DIRDOWN);
        instance.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRDOWNRIGHT));
        pembanding.MovePointer(Board.DIRDOWNRIGHT);
        instance.lakukanPerintah(new PerintahPutarBoard());
        pembanding.PutarBoard();
        instance.lakukanPerintah(new PerintahStartStopBuatKata());
        pembanding.StartStopBuatKata();
        instance.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRUP));
        pembanding.MovePointer(Board.DIRUP);
        instance.lakukanPerintah(new PerintahStartStopBuatKata());
        pembanding.StartStopBuatKata();
        instance.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRUP));
        pembanding.MovePointer(Board.DIRUP);
        
        PerintahGetGameState GGS = new PerintahGetGameState();
        instance.lakukanPerintah(GGS);
        
        //membandingkan target dan pembanding
        assertEquals(pembanding.GetBoard(),target.GetBoard());
        assertEquals(pembanding.getKataTerbentuk(),target.getKataTerbentuk());
        
        //membandingkan target dan hasil get
        try{
            assertEquals(target.GetBoard(),GGS.getGS().GetBoard());
            assertEquals(target.getKataTerbentuk(),GGS.getGS().getKataTerbentuk());
        }catch(InterruptedException ie){}
        sleep(2000);
        
        instance.interrupt();
        instance.join();
        
        assertFalse(instance.isAlive());
        

    }
    
}
