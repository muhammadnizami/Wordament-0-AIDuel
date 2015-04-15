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
    private boolean sedangBuatString;
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
    /** mengembalikan lokasi pointer
     * boleh tidak dicopy
     */
    public Point getPointer(){
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
    
    /**mengembalikan boolean apakah sedang membuat string
     * 
     * @return 
     */
    public boolean getSedangBuatString(){
        return sedangBuatString; /*belum diimplementasi*/
    }
    /** memulai board
     * mengeset stack menjadi kosong
     */
    public void StartBoard(){
        /* belum diimplementasi*/
    }
    /** memulai pembuatan string*/
    public void StartBuatString(){
        /* belum diimplementasi*/
    }
    /** menghentikan pembuatan string*/
    public String StopDanKirimString(){
        return null; /* belum diimplementasi*/
    }
    
    final Point DIRUPLEFT = new Point(-1,-1);
    final Point DIRUP = new Point(0,-1);
    final Point DIRUPRIGHT = new Point(0,-1);
    final Point DIRLEFT = new Point(0,-1);
    final Point DIRRIGHT = new Point(0,-1);
    final Point DIRDOWNLEFT = new Point(0,-1);
    final Point DIRDOWN = new Point(0,-1);
    final Point DIRDOWNRIGHT = new Point(0,-1);
    /**menggerakkan pointer
     * 
     * @param dir arah, di antara konstanta-konstanta DIRUPLEFT,DIRUP,DIRUPRIGHT,DIRLEFT,DIRRIGHT,DIRDOWNLEFT,DIRDOWN,DIRDOWNRIGHT. Selain itu, undefined behavior.
     */
    public void MovePointer(Point dir){
        /* belum diimplementasi*/
    }
    /**memutar sembilan puluh derajat clockwise
     * 
     */
    public void PutarBoard(){
        /* belum diimplementasi*/
    }
    /**mengembalikan string yang sedang dibentuk*/
    public String yangSedangDibentuk(){
        return null;/* belum diimplementasi*/
    }
    
}
