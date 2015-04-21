/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Class untuk menerima mulai input dan akhir input
 */
public class PerintahStartStopBuatKata implements Perintah{
    @Override
    public void execute(GameState GS){
        GS.StartStopBuatKata();
    }
}
