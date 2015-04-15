/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Point;
import java.util.Stack;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Kelas untuk menguji kelas Board
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBoard method, of class Board.
     */
    @Test
    public void testGetBoard() {
        char[][] A = {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'},{'M','N','O','P'}};
        System.out.println("getBoard");
        Board instance = new Board(A);
        char[][] expResult = A;
        char[][] result = instance.getBoard();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisited method, of class Board.
     */
    @Test
    public void testGetVisited() {
        System.out.println("getVisited");
        Board instance = new Board();
        boolean[][] expResult = new boolean[4][4];
        boolean[][] result = instance.getVisited();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPointer method, of class Board.
     */
    @Test
    public void testGetPointer() {
        System.out.println("getPointer");
        Board instance = new Board();
        Point expResult = null;
        Point result = instance.getPointer();
        // Tidak ada yang diharapkan
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSC method, of class Board.
     */
    @Test
    public void testGetSC() {
        System.out.println("getSC");
        Board instance = new Board();
        Stack<Character> expResult = new Stack<Character>();
        Stack<Character> result = instance.getSC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSP method, of class Board.
     */
    @Test
    public void testGetSP() {
        System.out.println("getSP");
        Board instance = new Board();
        Stack<Point> expResult = new Stack<Point>();
        Stack<Point> result = instance.getSP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StartBoard method, of class Board.
     */
    @Test
    public void testStartBoard() {
        System.out.println("StartBoard");
        char[][] A = {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'},{'M','N','O','P'}};
        Board instance = new Board(A);
        instance.StartBoard();
        assertEquals(new Point(0,0), instance.getPointer());
        fail("pointer pada awal harus di 0,0");
        assertArrayEquals(A, instance.getBoard());
        fail("papan kata harus sama dengan input");
        assertArrayEquals(new boolean[4][4], instance.getVisited());
        fail("visited seharusnya bernilai false semua");
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StartBuatString method, of class Board.
     */
    @Test
    public void testStartBuatString() {
        System.out.println("StartBuatString");
        Board instance = new Board();
        instance.StartBuatString();
        assertEquals(true,instance.getSedangBuatString());
        fail("seharusnya setelah distart getSedangBuatString() bernilai true");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StopDanKirimString method, of class Board.
     */
    @Test
    public void testStopDanKirimString() {
        System.out.println("StopDanKirimString");
        char[][] A = {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'},{'M','N','O','P'}};
        Board instance = new Board(A);
        instance.StartBuatString();
        String expResult = "A";
        String result = instance.StopDanKirimString();
        assertEquals(expResult, result);
        assertEquals(false,instance.getSedangBuatString());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MovePointer method, of class Board.
     */
    @Test
    public void testMovePointer() {
        System.out.println("MovePointer");
        Point dir = Board.DIRRIGHT;
        Board instance = new Board();
        instance.MovePointer(dir);
        assertEquals(new Point(0,1), instance.getPointer());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PutarBoard method, of class Board.
     */
    @Test
    public void testPutarBoard() {
        System.out.println("PutarBoard");
        char[][] A = {  {'A','B','C','D'},
                        {'E','F','G','H'},
                        {'I','J','K','L'},
                        {'M','N','O','P'}
        };
        Board instance = new Board(A);
        instance.PutarBoard();
        char[][] expectedMCSesudahDiputar = {
            {'M', 'I', 'E', 'N'},
            {'N', 'J', 'F', 'B'},
            {'O','K','G','C'},
            {'P','L','H','D'}
        };
        assertArrayEquals(expectedMCSesudahDiputar,instance.getBoard());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of yangSedangDibentuk method, of class Board.
     */
    @Test
    public void testYangSedangDibentuk() {
        System.out.println("yangSedangDibentuk");
        Board instance = new Board();
        String expResult = "";
        String result = instance.yangSedangDibentuk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
