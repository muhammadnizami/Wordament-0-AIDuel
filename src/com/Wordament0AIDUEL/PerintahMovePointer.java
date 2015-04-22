package com.Wordament0AIDUEL;

import java.awt.Point;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * kelas perintah menggerakkan pointer untuk dikirimkan kepada gameloop
 */
public class PerintahMovePointer implements Perintah{
    private Point dir;
    public static final Point DIRUPLEFT = Board.DIRUPLEFT;
    public static final Point DIRUP = Board.DIRUP;
    public static final Point DIRUPRIGHT = Board.DIRUPRIGHT;
    public static final Point DIRLEFT = Board.DIRLEFT;
    public static final Point DIRRIGHT = Board.DIRRIGHT;
    public static final Point DIRDOWNLEFT = Board.DIRDOWNLEFT;
    public static final Point DIRDOWN = Board.DIRDOWN;
    public static final Point DIRDOWNRIGHT = Board.DIRDOWNRIGHT;
    
    /**
     * 
     * @param _dir arah, di antara konstanta-konstanta DIRUPLEFT,DIRUP,DIRUPRIGHT,DIRLEFT,DIRRIGHT,DIRDOWNLEFT,DIRDOWN,DIRDOWNRIGHT. Selain itu, undefined behavior.
     */
    public PerintahMovePointer(Point _dir){
        dir=new Point(_dir);
    }
    
    /**
     * eksekusi
     * @param GS 
     */
    @Override
    public void execute(GameState GS){
        GS.MovePointer(dir);
    }
    /**
     * 
     * @return arah gerak
     */
    public Point getDir(){
        return dir;
    }
    /**
     * 
     * @param _dir arah, di antara konstanta-konstanta DIRUPLEFT,DIRUP,DIRUPRIGHT,DIRLEFT,DIRRIGHT,DIRDOWNLEFT,DIRDOWN,DIRDOWNRIGHT. Selain itu, undefined behavior.
     */
    public void setDir(Point _dir){
        dir = _dir;
    }
}
