/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Point;
import java.util.Stack;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
        assertArrayEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getVisited method, of class Board.
     */
    @Test
    public void testGetVisited() {
        System.out.println("getVisited");
        Board instance = new Board();
        boolean[][] expResult = new boolean[4][4];
        for (int i=0;i<4;i++)
            for (int j=0;j<4;j++)
                expResult[i][j]=false;
        boolean[][] result = instance.getVisited();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
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
        Stack<Character> result = instance.getSC();
        assertTrue(result.empty());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSP method, of class Board.
     */
    @Test
    public void testGetSP() {
        System.out.println("getSP");
        Board instance = new Board();
        Stack<Point> result = instance.getSP();
        assertTrue(result.empty());
        // TODO review the generated test code and remove the default call to fail.
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
        assertEquals(0,(int)instance.getPointer().getX());
        assertEquals(0,(int)instance.getPointer().getY());
        assertArrayEquals(A, instance.getBoard());
        assertArrayEquals(new boolean[4][4], instance.getVisited());
        
        // TODO review the generated test code and remove the default call to fail.
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
            {'M', 'I', 'E', 'A'},
            {'N', 'J', 'F', 'B'},
            {'O','K','G','C'},
            {'P','L','H','D'}
        };
        assertArrayEquals(expectedMCSesudahDiputar,instance.getBoard());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testPutarBoardSaatBuatKata() {
        char[][] A = {  {'A','B','C','D'},
                        {'E','F','G','H'},
                        {'I','J','K','L'},
                        {'M','N','O','P'}
        };
        Board instance = new Board(A);
        instance.StartBoard();
        instance.StartBuatString();
        instance.MovePointer(Board.DIRDOWNRIGHT);
        instance.MovePointer(Board.DIRDOWNRIGHT);
        instance.MovePointer(Board.DIRUP);
        boolean [][] expVisitedSebelumDiputar= {
            {true,false,false,false},
            {false,true,true,false},
            {false,false,true,false},
            {false,false,false,false}
        };
        assertArrayEquals(expVisitedSebelumDiputar,instance.getVisited());
        assertEquals("AFKG",instance.yangSedangDibentuk());
        instance.PutarBoard();
        char[][] expectedMCSesudahDiputar = {
            {'M', 'I', 'E', 'A'},
            {'N', 'J', 'F', 'B'},
            {'O','K','G','C'},
            {'P','L','H','D'}
        };
        assertArrayEquals(expectedMCSesudahDiputar,instance.getBoard());
        boolean[][] expVisitedSesudahDiputar = {
            {false,false,false,true},
            {false,false,true,false},
            {false,true,true,false},
            {false,false,false,false}
        };
        assertArrayEquals(expVisitedSesudahDiputar,instance.getVisited());
        assertEquals("AFKG",instance.yangSedangDibentuk());

    }

    /**
     * Test of yangSedangDibentuk method, of class Board.
     */
    @Test
    public void testYangSedangDibentuk() {
        System.out.println("yangSedangDibentuk");
        char[][] A = {  {'A','B','C','D'},
                        {'E','F','G','H'},
                        {'I','J','K','L'},
                        {'M','N','O','P'}
        };
        Board instance = new Board(A);
        String expResult = "A";
        instance.StartBoard();
        instance.StartBuatString();
        String result = instance.yangSedangDibentuk();
        assertEquals(expResult, result);
        assertEquals(true, instance.getSedangBuatString());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testBentukStringDiagonal() {
        System.out.println("yangSedangDibentuk");
        char[][] A = {  {'A','B','C','D'},
                        {'E','F','G','H'},
                        {'I','J','K','L'},
                        {'M','N','O','P'}
        };
        Board instance = new Board(A);
        String expResult = "A";
        instance.StartBoard();
        instance.StartBuatString();
        String result = instance.yangSedangDibentuk();
        assertEquals(expResult, result);
        assertEquals(true, instance.getSedangBuatString());
        
        assertEquals(new Point(1,1),Board.DIRDOWNRIGHT);
        assertEquals(new Point(0,0), instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        expResult = "AF";
        result = instance.yangSedangDibentuk();
        assertEquals(new Point(1,1), instance.getPointer());
        assertEquals('F',instance.getSC().peek().charValue());
        assertEquals(expResult, result);
        assertEquals(true, instance.getSedangBuatString());
        
        instance.MovePointer(Board.DIRDOWNRIGHT);
        expResult = "AFK";
        result = instance.yangSedangDibentuk();
        assertEquals(new Point(2,2), instance.getPointer());
        assertEquals('K',instance.getSC().peek().charValue());
        assertEquals(expResult, result);
        assertEquals(true, instance.getSedangBuatString());
        
        instance.MovePointer(Board.DIRDOWNRIGHT);
        expResult = "AFKP";
        result = instance.yangSedangDibentuk();
        assertEquals(new Point(3,3), instance.getPointer());
        assertEquals('P',instance.getSC().peek().charValue());
        assertEquals(expResult, result);
        assertEquals(true, instance.getSedangBuatString());
        
        expResult = "AFKP";
        result = instance.StopDanKirimString();
        assertEquals(expResult, result);
        assertEquals(false, instance.getSedangBuatString());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testBentukStringDiagonal2() {
        System.out.println("yangSedangDibentuk");
        char[][] A = {  {'A','B','C','D'},
                        {'E','F','G','H'},
                        {'I','J','K','L'},
                        {'M','N','O','P'}
        };
        Board instance = new Board(A);
        instance.StartBoard();
        assertEquals(new Point(0,0), instance.getPointer());
        
        for (int i=1;i<=3;i++){
            instance.MovePointer(Board.DIRRIGHT);
            assertEquals(new Point(0,i), instance.getPointer());
        }
        instance.StartBuatString();
        assertEquals(true, instance.getSedangBuatString());
        assertEquals("D",instance.yangSedangDibentuk());

        String expResult;
        String result;
        
        instance.MovePointer(Board.DIRDOWNLEFT);
        expResult = "DG";
        result = instance.yangSedangDibentuk();
        assertEquals(new Point(1,2), instance.getPointer());
        assertEquals('G',instance.getSC().peek().charValue());
        assertEquals(expResult, result);
        assertEquals(true, instance.getSedangBuatString());
        
        instance.MovePointer(Board.DIRDOWNLEFT);
        expResult = "DGJ";
        result = instance.yangSedangDibentuk();
        assertEquals(new Point(2,1), instance.getPointer());
        assertEquals('J',instance.getSC().peek().charValue());
        assertEquals(expResult, result);
        assertEquals(true, instance.getSedangBuatString());
        
        instance.MovePointer(Board.DIRDOWNLEFT);
        expResult = "DGJM";
        result = instance.yangSedangDibentuk();
        assertEquals(new Point(3,0), instance.getPointer());
        assertEquals('M',instance.getSC().peek().charValue());
        assertEquals(expResult, result);
        assertEquals(true, instance.getSedangBuatString());
        
        expResult = "DGJM";
        result = instance.StopDanKirimString();
        assertEquals(expResult, result);
        assertEquals(false, instance.getSedangBuatString());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testMovePointerDiUjungSaatTidakBuatKata() {
        System.out.println("yangSedangDibentuk");
        char[][] A = {  {'A','B','C','D'},
                        {'E','F','G','H'},
                        {'I','J','K','L'},
                        {'M','N','O','P'}
        };
        boolean[][] falsemat = new boolean[4][4];
        for (int i=0;i<4;i++)
            for (int j=0;j<4;j++)
                falsemat[i][j]=false;
        
        Board instance = new Board(A);
        instance.StartBoard();
        
        instance.MovePointer(Board.DIRUPRIGHT);
        assertEquals(new Point(0,1),instance.getPointer());
        assertArrayEquals(falsemat,instance.getVisited());
        instance.MovePointer(Board.DIRUPRIGHT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(0,2),instance.getPointer());
        instance.MovePointer(Board.DIRUPRIGHT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(0,3),instance.getPointer());
        instance.MovePointer(Board.DIRUPRIGHT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(0,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(1,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(2,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(3,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(3,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNLEFT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(3,2),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNLEFT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(3,1),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNLEFT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(3,0),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNLEFT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(3,0),instance.getPointer());
        instance.MovePointer(Board.DIRUPLEFT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(2,0),instance.getPointer());
        instance.MovePointer(Board.DIRUPLEFT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(1,0),instance.getPointer());
        instance.MovePointer(Board.DIRUPLEFT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(0,0),instance.getPointer());
        instance.MovePointer(Board.DIRUPLEFT);
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(0,0),instance.getPointer());
        assertArrayEquals(falsemat,instance.getVisited());
        assertEquals(new Point(0,0),instance.getPointer());  
    }
    
    @Test
    public void testMovePointerDiagonal(){
        Board instance = new Board();
        instance.StartBoard();
        
        assertEquals(new Point(0,0),instance.getPointer());
        for (int i=1;i<4;i++){
            instance.MovePointer(Board.DIRDOWNRIGHT);
            assertEquals(new Point(i,i),instance.getPointer());
        }
    }
    
    @Test
    public void testMovePointerDiUjungSaatSedangBuatKata() {
        System.out.println("yangSedangDibentuk");
        char[][] A = {  {'A','B','C','D'},
                        {'E','F','G','H'},
                        {'I','J','K','L'},
                        {'M','N','O','P'}
        };
        boolean[][] falsemat = new boolean[4][4];
        for (int i=0;i<4;i++)
            for (int j=0;j<4;j++)
                falsemat[i][j]=false;
        
        Board instance = new Board(A);
        instance.StartBoard();
        instance.StartBuatString();
        
        boolean expVisited[][]={{true, true, false, false},
                        {false, false, false, false},
                        {false, false, false, false},
                        {false, false, false, false}};
        
        instance.MovePointer(Board.DIRUPRIGHT);
        assertEquals("AB",instance.yangSedangDibentuk());
        assertEquals(new Point(0,1),instance.getPointer());
        assertArrayEquals(expVisited,instance.getVisited());
        instance.MovePointer(Board.DIRUPRIGHT);
        assertEquals("ABC",instance.yangSedangDibentuk());
        expVisited[0][2]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(0,2),instance.getPointer());
        instance.MovePointer(Board.DIRUPRIGHT);
        assertEquals("ABCD",instance.yangSedangDibentuk());
        expVisited[0][3]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(0,3),instance.getPointer());
        instance.MovePointer(Board.DIRUPRIGHT);
        assertEquals("ABCD",instance.yangSedangDibentuk());
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(0,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertEquals("ABCDH",instance.yangSedangDibentuk());
        expVisited[1][3]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(1,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertEquals("ABCDHL",instance.yangSedangDibentuk());
        expVisited[2][3]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(2,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertEquals("ABCDHLP",instance.yangSedangDibentuk());
        expVisited[3][3]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(3,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertEquals("ABCDHLP",instance.yangSedangDibentuk());
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(3,3),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNLEFT);
        assertEquals("ABCDHLPO",instance.yangSedangDibentuk());
        expVisited[3][2]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(3,2),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNLEFT);
        assertEquals("ABCDHLPON",instance.yangSedangDibentuk());
        expVisited[3][1]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(3,1),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNLEFT);
        assertEquals("ABCDHLPONM",instance.yangSedangDibentuk());
        expVisited[3][0]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(3,0),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNLEFT);
        assertEquals("ABCDHLPONM",instance.yangSedangDibentuk());
        assertArrayEquals(expVisited,instance.getVisited());
        expVisited[3][0]=true;
        assertEquals(new Point(3,0),instance.getPointer());
        instance.MovePointer(Board.DIRUPLEFT);
        assertEquals("ABCDHLPONMI",instance.yangSedangDibentuk());
        expVisited[2][0]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(2,0),instance.getPointer());
        instance.MovePointer(Board.DIRUPLEFT);
        assertEquals("ABCDHLPONMIE",instance.yangSedangDibentuk());
        expVisited[1][0]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(1,0),instance.getPointer());
        instance.MovePointer(Board.DIRUPLEFT);
        assertEquals("A",instance.yangSedangDibentuk());
        expVisited=falsemat;
        expVisited[0][0]=true;
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(0,0),instance.getPointer());
        instance.MovePointer(Board.DIRUPLEFT);
        assertEquals("A",instance.yangSedangDibentuk());
        assertArrayEquals(expVisited,instance.getVisited());
        assertEquals(new Point(0,0),instance.getPointer());  
        assertEquals(new Point(0,0),instance.getPointer());
    }
    
    @Test
    public void testBuatStringDiSegitigaBawah(){
        System.out.println("yangSedangDibentuk");
        char[][] A = {  {'A','B','C','D'},
                        {'E','F','G','H'},
                        {'I','J','K','L'},
                        {'M','N','O','P'}
        };
        boolean[][] expVisited = new boolean[4][4];
        for (int i=0;i<4;i++)
            for (int j=0;j<4;j++)
                expVisited[i][j]=false;
        
        Board instance = new Board(A);
        instance.StartBoard();
        instance.StartBuatString();
        
        instance.MovePointer(Board.DIRDOWNRIGHT);
        instance.MovePointer(Board.DIRDOWNRIGHT);
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertEquals("AFKP",instance.yangSedangDibentuk());
        instance.MovePointer(Board.DIRLEFT);
        instance.MovePointer(Board.DIRLEFT);
        instance.MovePointer(Board.DIRLEFT);
        assertEquals("AFKPONM",instance.yangSedangDibentuk());
        instance.MovePointer(Board.DIRLEFT);
        assertEquals("AFKPONM",instance.yangSedangDibentuk());
        instance.MovePointer(Board.DIRUP);
        instance.MovePointer(Board.DIRUP);
        instance.MovePointer(Board.DIRUP);
        assertEquals("A",instance.yangSedangDibentuk());
        instance.MovePointer(Board.DIRUP);
        assertEquals("A",instance.yangSedangDibentuk());
        
        expVisited[0][0]=true;
        Assert.assertArrayEquals(expVisited,instance.getVisited());
        
        assertEquals("A",instance.StopDanKirimString());
        expVisited[0][0]=false;
        Assert.assertArrayEquals(expVisited,instance.getVisited());
    }
    
    @Test
    public void testMovePointerSaatTidakBuatKata(){
        Board instance = new Board();
        instance.StartBoard();
        
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertEquals(new Point(1,1),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNRIGHT);
        assertEquals(new Point(2,2),instance.getPointer());
        instance.MovePointer(Board.DIRUPLEFT);
        assertEquals(new Point(1,1),instance.getPointer());
        instance.MovePointer(Board.DIRDOWN);
        assertEquals(new Point(2,1),instance.getPointer());
        instance.MovePointer(Board.DIRUP);
        assertEquals(new Point(1,1),instance.getPointer());
        instance.MovePointer(Board.DIRDOWNLEFT);
        assertEquals(new Point(2,0),instance.getPointer());
        instance.MovePointer(Board.DIRUPRIGHT);
        assertEquals(new Point(1,1),instance.getPointer());
        instance.MovePointer(Board.DIRLEFT);
        assertEquals(new Point(1,0),instance.getPointer());
        instance.MovePointer(Board.DIRRIGHT);
        assertEquals(new Point(1,1),instance.getPointer());
    }
    
}
