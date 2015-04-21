import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Status permainan, meliputi Board, kamus, serta kata yang sudah dibentuk
 */
public class GameState {
    private Board CB;
    private Set<String> kamus;
    private SortedSet<Kata> kataTerbentuk;
    
    /**ctor*/
    public GameState(){
        CB = new Board();
        kamus = new TreeSet<String>();
        kataTerbentuk = new TreeSet<Kata>();
        CB.StartBoard();
    }
    /**ctor
     * membuat sebuah gamestate dengan matriks kata Matkar dan kamus kata _kamus
     * @param MatKar matriks 4X4
     * @param _kamus kamus kata
     */
    public GameState(char[][] MatKar, Set<String> _kamus){
        assert(MatKar.length==4);
        for (char[] baris : MatKar) assert (baris.length==4);
        
        CB = new Board(MatKar);
        kamus = _kamus;
        CB.StartBoard();
        
    }
    
    /**memulai/mengakhiri pembuatan kata
     * 
     */
    public void StartStopBuatKata(){
        if (CB.getSedangBuatString()){
            String s = CB.StopDanKirimString();
            if (kamus.contains(s))
                kataTerbentuk.add(new Kata(s));
        }else{
            CB.StartBuatString();
        }
        
    }
    
    /**memindahkan pointer
     * 
     * @param _dir arah
     */
    public void MovePointer(Point _dir){
        CB.MovePointer(_dir);
        
    }
    /**memutar board*/
    public void PutarBoard(){
        CB.PutarBoard();
        
    }
    /**
     * @return Board permainan*/
    public Board GetBoard(){
        return CB;/* belum diimplementasi*/
    }
    
    public int totalScore(){
        int sum = 0;
        for (Kata k : kataTerbentuk)
            sum+= k.getScore();
        return sum;
    }
    
}
