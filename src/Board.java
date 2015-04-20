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
    private boolean[][] visited;
    Stack<Character> SC = new Stack<Character>();
    Stack<Point> SP = new Stack<Point>();
    Point pointer = new Point();
    private boolean sedangBuatString;
    /** ctor */
    public Board(){
        board = new char[4][4];
        visited = new boolean[4][4];
        for (int i=0;i<4;i++)
            for (int j=0;j<4;j++)
                visited[i][j]=false;
    }
    /** ctor dengan parameter
     * membuat Board dengan matriks karakter _board
     *  @param _board prekondisi: berukuran 4X4
    */
    public Board(char[][] _board){
        board = new char[_board.length][];
        for (int i=0;i<4;i++)board[i]=_board[i].clone();
        visited = new boolean[4][4];
        for (int i=0;i<4;i++)
            for (int j=0;j<4;j++)
                visited[i][j]=false;
        SC = new Stack<Character>();
        SP = new Stack<Point>();
        pointer = new Point();
    }
    /** cctor
     * deep copy
     * @param B prekondisi: tidak null
     */
    public Board(Board B){
        board = new char[B.board.length][];
        for (int i=0;i<4;i++)board[i]=B.board[i].clone();
        visited = new boolean[B.visited.length][];
        for (int i=0;i<4;i++)visited[i]=B.visited[i].clone();
        SC=(Stack<Character>)B.SC.clone();
        SP=(Stack<Point>)B.SP.clone();
        pointer = (Point) B.pointer.clone();
        sedangBuatString = B.sedangBuatString;
    }
    
    /** mengembalikan matriks karakter
     * boleh tidak dicopy
     */
    public char[][] getBoard(){
        return board;/* belum diimplementasi*/
    }
    /** mengembalikan matriks visited
     * boleh tidak dicopy
     */
    public boolean[][] getVisited(){
        return visited;/* belum diimplementasi*/
    }
    /** mengembalikan lokasi pointer
     * boleh tidak dicopy
     */
    public Point getPointer(){
        return pointer;/* belum diimplementasi*/
    }
    /** mengembalikan stack karakter
     * boleh tidak dicopy
     */
    public Stack<Character> getSC(){
        return SC;/* belum diimplementasi*/
    }
    /** mengembalikan stack point
     * boleh tidak dicopy
     */
    public Stack<Point> getSP(){
        return SP;/* belum diimplementasi*/
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
        for (boolean[] row : visited)
            for (boolean b : row)
                b=false;
        SC.clear();
        SP.clear();
	pointer.setLocation(0, 0);
        sedangBuatString = false;
    }
    /** memulai pembuatan string*/
    public void StartBuatString(){
        sedangBuatString = true;
        visited[pointer.x][pointer.y]=true;
        SC.push(board[pointer.x][pointer.y]);
        SP.push(new Point(pointer));
    }
    /** menghentikan pembuatan string*/
    public String StopDanKirimString(){
        sedangBuatString = false;
        Stack<Character> SCrev = new Stack<Character>();
        
        //membalik dan mengosongkan SC
        while (!SC.empty()){
            Character A = SC.pop();
            SCrev.push(A);
        }
        
        //membentuk string
        String retval = "";
        while (!SCrev.empty()){
            Character A = SCrev.pop();
            retval += A;
        }
        
        //mengosongkan SP
        while (!SP.empty()) SP.pop();
        
        //membuat visited menjadi false
        for (boolean[] visited1 : visited) {
            for (int j = 0; j < visited1.length; j++) {
                visited1[j] = false;
            }
        }
        
        return retval;
    }
    
    public static final Point DIRUPLEFT = new Point(-1,-1);
    public static final Point DIRUP = new Point(-1,0);
    public static final Point DIRUPRIGHT = new Point(-1,1);
    public static final Point DIRLEFT = new Point(0,-1);
    public static final Point DIRRIGHT = new Point(0,1);
    public static final Point DIRDOWNLEFT = new Point(1,-1);
    public static final Point DIRDOWN = new Point(1,0);
    public static final Point DIRDOWNRIGHT = new Point(1,1);
    /**menggerakkan pointer
     * 
     * @param dir arah, di antara konstanta-konstanta DIRUPLEFT,DIRUP,DIRUPRIGHT,DIRLEFT,DIRRIGHT,DIRDOWNLEFT,DIRDOWN,DIRDOWNRIGHT. Selain itu, undefined behavior.
     */
    public void MovePointer(Point dir){
        pointer.translate(dir.x,dir.y);
        if (pointer.x < 0) pointer.x=0;
        if (pointer.x > 3) pointer.x=3;
        if (pointer.y < 0) pointer.y=0;
        if (pointer.y > 3) pointer.y=3;
        
        if (sedangBuatString){
            if (!visited[pointer.x][pointer.y]){
                SP.push(new Point(pointer));
                SC.push(board[pointer.x][pointer.y]);
                visited[pointer.x][pointer.y]=true;
            }else{
                while (!pointer.equals(SP.peek())){
                    SC.pop();
                    Point p = SP.pop();
                    visited[p.x][p.y] = false;
                }
            }
        }
        
    }
    /**memutar sembilan puluh derajat clockwise
     * 
     */
    public void PutarBoard(){
        /* belum diimplementasi*/
        PutarPoint44(pointer);
        spPutar44(SP);
        mcPutar(board);
        mbPutar(visited);
    }
    
    //helper
    private void spPutar44(Stack<Point> s){
        Stack<Point> temp = new Stack<>();
        while (!s.empty()){
            temp.push(s.pop());
        }
        while (!temp.empty()){
            Point tmpx = temp.pop();
            PutarPoint44(tmpx);
            s.push(tmpx);
        }
    }
    private void PutarPoint44(Point p){
        int i,j;
        i = (int)p.x;
        j = (int)p.y;
        p.setLocation(j,4-i);
    }
    private void mcPutar(char[][] M){
        char[][] Mtmp = new char[M.length][];
        for (int i=0;i<Mtmp.length;i++) Mtmp[i]=M[i].clone();
        for (int i=0;i<M.length;i++)
            for (int j=0;j<M[i].length;j++){
                M[i][j]=Mtmp[M.length-j-1][i];
            }
    }
    private void mbPutar(boolean[][] M){
        boolean[][] Mtmp = new boolean[M.length][];
        for (int i=0;i<Mtmp.length;i++) Mtmp[i]=M[i].clone();
        for (int i=0;i<M.length;i++)
            for (int j=0;j<M[i].length;j++){
                M[i][j]=Mtmp[M.length-j-1][i];
            }
    }
    /**mengembalikan string yang sedang dibentuk*/
    public String yangSedangDibentuk(){
        Stack<Character> tmp = (Stack<Character>) SC.clone();
        Stack<Character> tmprev = new Stack<Character>();
        while (!tmp.empty())
            tmprev.push(tmp.pop());
        String retval = "";
        while (!tmprev.empty()){
            retval+=tmprev.pop();
        }
        return retval;
    }
    
}
