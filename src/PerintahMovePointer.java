import java.awt.Point;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest
 */
public class PerintahMovePointer {
    private Point dir;
    public void PerintahMovePointer(Point _dir){
        
    }
    public void execute(GameState GS){
        GS.MovePointer(dir);
    }
    public Point getDir(){
        return dir;
    }
    public void setDir(Point _dir){
        dir = _dir;
    }
}
