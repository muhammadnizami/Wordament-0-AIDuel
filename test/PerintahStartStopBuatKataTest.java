/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nim_13512501
 */
public class PerintahStartStopBuatKataTest {
    
    public PerintahStartStopBuatKataTest() {
    }

    @Test
    public void testExecute() {
        System.out.println("execute");
        GameState GS = new GameState();
        PerintahStartStopBuatKata instance = new PerintahStartStopBuatKata();
        instance.execute(GS);
        assertTrue(GS.GetBoard().getSedangBuatString());
        PerintahStartStopBuatKata instance2 = new PerintahStartStopBuatKata();
        instance2.execute(GS);
        assertFalse(GS.GetBoard().getSedangBuatString());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
