import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

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
    private BlockingQueue<Perintah> antrianPerintah;
    /**ctor
     * 
     */
    public GameLoop(){
        GS = new GameState();
        antrianPerintah= new LinkedBlockingQueue<Perintah>();
    }
    /**ctor
     * 
     * @param _GS (unsafe)
     */
    public GameLoop(GameState _GS){
        GS = _GS;
        antrianPerintah= new LinkedBlockingQueue<>();
        /*belum diimplementasi*/
    }
    /**ctor
     * 
     * @param matchar matriks karakter pada board
     * @param Kamus kamus kata (unsafe, bisa jadi tidak dicopy)
     */
    public GameLoop(char[][] matchar, Set<String> Kamus){
        GS = new GameState(matchar,Kamus);
        antrianPerintah= new LinkedBlockingQueue<>();
    }
    
    /** interrupt diwarisi dari Thread*/
    /**menjalankan thread
     * menerima perintah dan melaksanakannya hingga diinterupt
     */
    @Override
    public void run(){
        while (!interrupted()){
            try{
                System.out.println("menunggu/menjalankan perintah");
                Perintah t = antrianPerintah.take();
                t.execute(GS);
            }catch(InterruptedException e){
                antrianPerintah.clear();
                System.out.println("GameLoop interrupted");
                break;
            }
            /*belum diimplementasi*/
        }
    }
    
    /**
     * method ini yang dipanggil oleh pemain dan view untuk menjalankan perintah atau mengambil informasi
     * @param P 
     */
    public void lakukanPerintah(Perintah P){
        antrianPerintah.add(P);
        /*belum diimplementasi*/
    }   
    
}
