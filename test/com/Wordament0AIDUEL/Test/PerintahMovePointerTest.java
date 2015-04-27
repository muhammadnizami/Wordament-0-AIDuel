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
import com.Wordament0AIDUEL.PerintahMovePointer;
import com.Wordament0AIDUEL.PerintahMovePointer;
import java.awt.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nim_13512501
 */
public class PerintahMovePointerTest {
    
    public PerintahMovePointerTest() {
    }

    @Test
    public void testExecute1() {
        System.out.println("execute");
        GameState GS = new GameState();
        PerintahMovePointer instance = new PerintahMovePointer(PerintahMovePointer.DIRDOWNRIGHT);
        Board B = new Board();
        B.StartBoard();
        B.MovePointer(Board.DIRDOWNRIGHT);
        instance.execute(GS);
        assertEquals(B,GS.GetBoard());
    }
    @Test
    public void testExecute2() {
        System.out.println("execute");
        GameState GS = new GameState();
        PerintahMovePointer instance = new PerintahMovePointer(PerintahMovePointer.DIRUPRIGHT);
        Board B = new Board();
        B.StartBoard();
        B.MovePointer(Board.DIRUPRIGHT);
        instance.execute(GS);
        assertEquals(B,GS.GetBoard());
    }
    @Test
    public void testExecute3() {
        System.out.println("execute");
        GameState GS = new GameState();
        PerintahMovePointer instance = new PerintahMovePointer(PerintahMovePointer.DIRDOWNLEFT);
        Board B = new Board();
        B.StartBoard();
        B.MovePointer(Board.DIRDOWNLEFT);
        instance.execute(GS);
        assertEquals(B,GS.GetBoard());
    }

    @Test
    public void testGetDir() {
        System.out.println("getDir");
        Point P = new Point();
        PerintahMovePointer instance = new PerintahMovePointer(P);
        Point result = instance.getDir();
        assertEquals(P, result);
    }

    @Test
    public void testSetDir() {
        System.out.println("setDir");
        Point _dir = new Point();
        PerintahMovePointer instance = new PerintahMovePointer(new Point());
        instance.setDir(_dir);
        assertEquals(_dir, instance.getDir());
    }
    
}
