import java.util.Stack;
import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini meliputi matriks karakter untuk membentuk kata
 */
public class Board {
    /** matriks karakter berukuran 4X4*/
    private char[][] board; 
    /** matriks boolean berukuran 4X4 yang menunjukkan apakah suatu sel telah 
     *  dikunjungi dalam pembuatan kata
     */
    private boolean[][] visited = new boolean[4][4];
    Stack<Character> SC = new Stack<Character>();
    Stack<Point> SP = new Stack<Point>();
    /** ctor */
    public Board(){
        board = new char[4][4];
    }
    /** ctor dengan parameter
     * membuat Board dengan matriks karakter _board
     *  @param _board prekondisi: berukuran 4X4
    */
    public Board(char[][] _board){
        
    }
    /** cctor
     * deep copy
     * @param B prekondisi: tidak null
     */
    public Board(Board B){
        
    }
    
    /** mengembalikan matriks karakter
     * boleh tidak dicopy
     */
    public char[][] getBoard(){
        return null;/* belum diimplementasi*/
    }
    /** mengembalikan matriks visited
     * boleh tidak dicopy
     */
    public boolean[][] getVisited(){
        return null;/* belum diimplementasi*/
    }
    /** mengembalikan stack karakter
     * boleh tidak dicopy
     */
    public Stack<Character> getSC(){
        return null;/* belum diimplementasi*/
    }
    /** mengembalikan stack point
     * boleh tidak dicopy
     */
    public Stack<Point> getSP(){
        return null;/* belum diimplementasi*/
    }
    public void StartBoard(){
        
    }
    
    
}
