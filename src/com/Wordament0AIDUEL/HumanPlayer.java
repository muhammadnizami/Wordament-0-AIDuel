package com.Wordament0AIDUEL;


import com.Wordament0AIDUEL.Player;
import com.Wordament0AIDUEL.PerintahMovePointer;
import com.Wordament0AIDUEL.PerintahPutarBoard;
import com.Wordament0AIDUEL.PerintahStartStopBuatKata;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Class pemain
 */
public class HumanPlayer implements Player {
    private GameLoop GL;
    Component keyPressSource;
    
    public HumanPlayer(GameLoop _GL, Component _keyPressSource){
        keyPressSource = _keyPressSource;
        GL = _GL;
    }
    
    public class PKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent event){
            char ch = event.getKeyChar();
            switch(ch){
                case 'R':
                case 'r':
                    GL.lakukanPerintah(new PerintahPutarBoard());
                    break;
                case 'Q':
                case 'q':
                    GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRUPLEFT));
                    break;
                case 'W':
                case 'w':
                    GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRUP));
                    break;
                case 'E':
                case 'e':
                    GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRUPRIGHT));
                    break;
                case 'A':
                case 'a':
                    GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRLEFT));
                    break;
                case 'D':
                case 'd':
                    GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRRIGHT));
                    break;
                case 'Z':
                case 'z':
                    GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRDOWNLEFT));
                    break;
                case 'X':
                case 'x':
                    GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRDOWN));
                    break;
                case 'C':
                case 'c':
                    GL.lakukanPerintah(new PerintahMovePointer(PerintahMovePointer.DIRDOWNRIGHT));
                    break;
                case 'S':
                case 's':
                    GL.lakukanPerintah(new PerintahStartStopBuatKata());
                    break;
            }
        }
    }
    @Override
    public void run(){
        PKeyListener tmpKeyListener = new PKeyListener();
        keyPressSource.addKeyListener(tmpKeyListener);
        try{(new Object()).wait();}
        catch(InterruptedException ie){}
        keyPressSource.removeKeyListener(tmpKeyListener);
    }
    @Override
    public void setGame (GameLoop _GL){
        GL = _GL;
    }
    public GameLoop getGameLoop(){
        return GL;
    }
}
