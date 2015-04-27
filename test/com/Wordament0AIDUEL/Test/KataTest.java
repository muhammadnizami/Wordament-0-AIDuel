package com.Wordament0AIDUEL.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Wordament0AIDUEL.Kata;
import com.Wordament0AIDUEL.Kata;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nim_13512501
 */
public class KataTest {
    
    public KataTest() {
    }

    @Test
    public void testSetK() {
        System.out.println("setK");
        String s = "";
        Kata instance = new Kata();
        instance.setK(s);
        assertEquals(s,instance.getK());
        assertEquals(0,instance.getScore());
    }

    @Test
    public void testGetK() {
        System.out.println("getK");
        Kata instance = new Kata();
        String expResult = "";
        String result = instance.getK();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Kata instance = new Kata();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Kata o = new Kata();
        Kata instance = new Kata();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        assertEquals(0,(new Kata("A").compareTo(new Kata("A"))));
        assertNotSame(0,(new Kata("A").compareTo(new Kata("AB"))));
        assertNotSame(0,(new Kata("COWS").compareTo(new Kata("RAZE"))));
    }
    
    @Test
    public void testKataLAZE(){
        Kata k = new Kata("LAZE");
        assertEquals(56,k.getScore());
    }
    @Test
    public void testKataRAZE(){
        Kata k = new Kata("RAZE");
        assertEquals(52,k.getScore());
    }
    @Test
    public void testKataCOWS(){
        Kata k = new Kata("COWS");
        assertEquals(52,k.getScore());
    }
    @Test
    public void testKataSOWN(){
        Kata k = new Kata("SOWN");
        assertEquals(48,k.getScore());
    }
    @Test
    public void testKataWIDE(){
        Kata k = new Kata("WIDE");
        assertEquals(48,k.getScore());
    }
    @Test
    public void testKataBEAR(){
        Kata k = new Kata("BEAR");
        assertEquals(40,k.getScore());
    }
    
    @Test
    public void testKataPOW(){
        Kata k = new Kata("POW");
        assertEquals(36,k.getScore());
    }
    
    @Test
    public void testKataFGHJKMQTUVX(){
        Kata k = new Kata("FGHJKMQTUVX");
        assertEquals(804,k.getScore());
    }
    
    @Test
    public void testSetKataDenganScore(){
        Kata k = new Kata();
        k.setK("A");
        assertEquals(2,k.getScore());
    }
    
}
