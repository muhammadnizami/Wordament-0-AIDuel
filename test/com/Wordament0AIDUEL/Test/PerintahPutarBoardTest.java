package com.Wordament0AIDUEL.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Wordament0AIDUEL.Board;
import com.Wordament0AIDUEL.Board;
import com.Wordament0AIDUEL.GameState;
import com.Wordament0AIDUEL.GameState;
import com.Wordament0AIDUEL.PerintahPutarBoard;
import com.Wordament0AIDUEL.PerintahPutarBoard;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nim_13512501
 */
public class PerintahPutarBoardTest {
    
    @Test
    public void testExecute() {
        System.out.println("execute");
        GameState GS = new GameState();
        Board b = new Board(GS.GetBoard());
        b.PutarBoard();
        PerintahPutarBoard instance = new PerintahPutarBoard();
        instance.execute(GS);
        assertEquals(b,GS.GetBoard());
    }
    
}
