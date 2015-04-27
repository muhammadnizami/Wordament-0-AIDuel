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
import com.Wordament0AIDUEL.Kata;
import com.Wordament0AIDUEL.Kata;
import java.awt.Point;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TreeSet;

public class GameStateTest {
    
    public GameStateTest() {
    }

    @Test
    public void testStartStopBuatKata() {
        System.out.println("StartStopBuatKata");
        char[][] matchar = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P'}
        };
        TreeSet<String> kamus = new TreeSet<String>();
        kamus.add("A");
        GameState instance = new GameState(matchar,kamus);
        instance.StartStopBuatKata();
        assertTrue(instance.GetBoard().getSedangBuatString());
        instance.StartStopBuatKata();
        assertFalse(instance.GetBoard().getSedangBuatString());
        assertEquals(2,instance.totalScore());
        assertTrue(instance.getKataTerbentuk().contains(new Kata("A")));
        
    }
    
    @Test
    public void testBentukDuaKataSama(){
        char[][] matchar = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P'}
        };
        TreeSet<String> kamus = new TreeSet<String>();
        kamus.add("A");
        GameState instance = new GameState(matchar,kamus);
        instance.StartStopBuatKata();
        assertTrue(instance.GetBoard().getSedangBuatString());
        instance.StartStopBuatKata();
        assertFalse(instance.GetBoard().getSedangBuatString());
        assertEquals(2,instance.totalScore());
        assertTrue(instance.getKataTerbentuk().contains(new Kata("A")));
        
        instance.StartStopBuatKata();
        assertTrue(instance.GetBoard().getSedangBuatString());
        instance.StartStopBuatKata();
        assertFalse(instance.GetBoard().getSedangBuatString());
        assertEquals(2,instance.totalScore());
        assertTrue(instance.getKataTerbentuk().contains(new Kata("A")));
        
    }

    @Test
    public void testMovePointer() {
        System.out.println("MovePointer");
        Point _dir = Board.DIRDOWN;
        GameState instance = new GameState();
        instance.MovePointer(_dir);
        assertEquals(new Point(1,0),instance.GetBoard().getPointer());
    }

    @Test
    public void testPutarBoard() {
        System.out.println("PutarBoard");
        char[][] matchar = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P'}
        };
        GameState instance = new GameState(matchar, new TreeSet<String>());
        instance.PutarBoard();
        
        Board b = new Board(matchar);
        b.PutarBoard();
        
        assertEquals(b,instance.GetBoard());
    }

    @Test
    public void testGetBoard() {
        System.out.println("GetBoard");
        char[][] matchar = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P'}
        };
        
        GameState instance = new GameState(matchar, new TreeSet<String>());
        Board expResult = new Board(matchar);
        expResult.StartBoard();
        Board result = instance.GetBoard();
        assertEquals(expResult, result);
    }

    @Test
    public void testTotalScore() {
        System.out.println("totalScore");
        char[][] matchar = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P'}
        };
        TreeSet<String> kamus = new TreeSet<String>();
        kamus.add("A");
        GameState instance = new GameState(matchar,kamus);
        instance.StartStopBuatKata();
        assertTrue(instance.GetBoard().getSedangBuatString());
        instance.StartStopBuatKata();
        assertFalse(instance.GetBoard().getSedangBuatString());
        assertEquals(2,instance.totalScore());
    }
    
}
