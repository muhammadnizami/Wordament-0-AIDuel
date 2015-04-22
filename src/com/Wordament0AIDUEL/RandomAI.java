package com.Wordament0AIDUEL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * AI ini mengirimkan perintah secara acak setiap 100 ms kepada gameloop
 * gunakan kelas thread untuk menjalankan AIPlayer ini
 */
public class RandomAI implements AIPlayer {
    private GameLoop GL;
    /**
     * 
     * @param _GL Gameloop yang menerima perintah dari AIPlayer ini
     */
    public RandomAI(){
        GL = null;
    }
    
    public RandomAI(GameLoop _GL){
            GL = _GL;
    }
    
    public GameLoop getGameLoop(){
        return GL;
    }
    
    /**
     * mengirimkan perintah secara acak hingga diinterupsi
     */
    public void run(){
        Random r = new Random();
        while (!Thread.currentThread().isInterrupted()){
            try{                
                sleep(100);
                int a = r.nextInt(11);
                switch(a){
                    case 0:
                        GL.lakukanPerintah(new PerintahPutarBoard());
                        break;
                    case 1:
                        GL.lakukanPerintah(new PerintahStartStopBuatKata());
                        break;
                    case 2:
                        GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRDOWN));
                        break;
                    case 3:
                        GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRDOWNLEFT));
                        break;
                    case 4:
                        GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRDOWNRIGHT));
                        break;
                    case 5:
                        GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRLEFT));
                        break;
                    case 6:
                        GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRRIGHT));
                        break;
                    case 7:
                        GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRUP));
                        break;
                    case 8:
                        GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRUPLEFT));
                        break;
                    case 9:
                        GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRUPRIGHT));
                        break;
                    case 10:
                        PerintahGetGameState PGGS = new PerintahGetGameState();
                        GL.lakukanPerintah(PGGS);
                        PGGS.getGS();
                        break;
                    
                }
            }catch(InterruptedException e){
                break;
            }
        }
    }
    /**
     * 
     * @param _GL Gameloop yang menerima perintah dari AIPlayer ini
     */
    public void setGame (GameLoop _GL){
        GL = _GL;
    }
}
