import java.util.Set;
import java.util.SortedSet;
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
        /* belum diimplementasi*/
    }
    /**ctor
     * membuat sebuah gamestate dengan matriks kata Matkar dan kamus kata _kamus
     * @param MatKar matriks 4X4
     * @param _kamus kamus kata
     */
    public GameState(char[][] MatKar, Set<String> _kamus){
        /* belum diimplementasi*/
    }
    
    /**memulai/mengakhiri pembuatan kata
     * 
     */
    public void StartStopBuatKata(){
        /* belum diimplementasi*/
        
    }
    
    /**memindahkan pointer
     * 
     * @param _dir arah
     */
    public void MovePointer(Point _dir){
        /* belum diimplementasi*/
        
    }
    /**memutar board*/
    public void PutarBoard(){
        /* belum diimplementasi*/
        
    }
    /**mengembalikan board*/
    public Board GetBoard(){
        return null;/* belum diimplementasi*/
        
    }
    
}
