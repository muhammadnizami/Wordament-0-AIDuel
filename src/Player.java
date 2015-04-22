/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest
 */
public interface Player extends Runnable {
    @Override
    public void run();

    /**
     * menetapkan GameLoop yang menjadi agen
     * @param GL agen dari perintah yang dikirimkan
     */
    public void setGame (GameLoop GL);
}
