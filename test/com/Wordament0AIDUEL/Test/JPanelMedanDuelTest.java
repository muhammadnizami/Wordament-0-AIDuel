/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Wordament0AIDUEL.Test;

import com.Wordament0AIDUEL.DataFile;
import com.Wordament0AIDUEL.JPanelMedanDuel;
import com.Wordament0AIDUEL.RandomAI;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LUCKY
 */
public class JPanelMedanDuelTest {
    
    public JPanelMedanDuelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of bermain method, of class JPanelMedanDuel.
     */
    @Test
    public void testBermain() throws Exception {
        System.out.println("bermain");
        File F = new File("GameData/Dictionary.txt");
        DataFile fdict = new DataFile(F,"Kamus");
        File F2 = new File("GameData/boardFiles/0.txt");
        DataFile fmatchar = new DataFile(F2,"Matchar");
        
        JPanelMedanDuel instance = new JPanelMedanDuel(new RandomAI(),fmatchar.getMatChar4x4(),fdict.getKamus());
        
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
