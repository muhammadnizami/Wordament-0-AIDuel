import java.util.Set;
import java.util.Queue; //dapat diganti, tergantung 
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nim_13512501
 */
public class GameLoop extends Thread{
    private GameState GS;
    Queue<Perintah> SQP = new ConcurrentLinkedQueue<Perintah>();
    /**ctor
     * 
     */
    public GameLoop(){
        /* belum diimplementasi*/
    }
    /**ctor
     * 
     * @param _GS (unsafe)
     */
    public GameLoop(GameState _GS){
        /*belum diimplementasi*/
    }
    /**ctor
     * 
     * @param matchar matriks karakter pada board
     * @param Kamus kamus kata (unsafe, bisa jadi tidak dicopy)
     */
    public GameLoop(char[][] matchar, Set<String> Kamus){
        /*belum diimplementasi*/
    }
    
    /** interrupt diwarisi dari Thread*/
    /**menjalankan thread
     * menerima perintah dan melaksanakannya hingga diinterupt
     */
    public void run(){
        /*belum diimplementasi*/
    }
    
    /**
     * method ini yang dipanggil oleh pemain dan view untuk menjalankan perintah atau mengambil informasi
     * @param P 
     */
    public void lakukanPerintah(Perintah P){
        /*belum diimplementasi*/
    }   
    
}
