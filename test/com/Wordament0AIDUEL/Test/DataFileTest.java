package com.Wordament0AIDUEL.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.Wordament0AIDUEL.DataFile;
import com.Wordament0AIDUEL.DataFile;
import java.io.File;
import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LUCKY
 */
public class DataFileTest {
    
    public DataFileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getKamus method, of class DataFile.
     */
    @Test
    public void testKamus() throws Exception {
        System.out.println("getKamus");
        File F = new File("test/dftest/Dictionary.txt");
        DataFile instance = new DataFile(F,"Kamus");
        Set<String> Kamus = instance.getKamus();
        boolean result = Kamus.contains("RUGGEDEST");
        boolean expResult = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testKamus2() throws Exception {
        System.out.println("getKamus");
        File F = new File("test/dftest/Dictionary.txt");
        DataFile instance = new DataFile(F,"Kamus");
        Set<String> Kamus = instance.getKamus();
        boolean result = Kamus.contains("ADSD");
        boolean expResult = false;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMatChar4x4 method, of class DataFile.
     */
    @Test
    public void testGetMatChar4x4() throws Exception {
        System.out.println("getMatChar4x4");
        File F = new File("test/dftest/array.txt");
        DataFile instance = new DataFile(F,"Kamus");
        char[][] expResult = new char[][] {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'}};
        char[][] result = instance.getMatChar4x4();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetMatChar4x42() throws Exception {
        System.out.println("getMatChar4x4");
        File F = new File("test/dftest/array1.txt");
        DataFile instance = new DataFile(F,"Kamus");
        char[][] expResult = new char[][] {{'a','e','i','m'},{'b','f','j','n'},{'c','g','k','o'},{'d','h','l','p'}};
        char[][] result = instance.getMatChar4x4();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isfileKamus method, of class DataFile.
     */
    @Test
    public void testIsfileKamus() {
        System.out.println("isfileKamus");
         File F = new File("test/dftest/Dictionary.txt");
        DataFile instance = new DataFile(F,"Kamus");
        boolean expResult = true;
        boolean result = instance.isfileKamus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsfileKamus2() {
        System.out.println("isfileKamus");
        File F = new File("test/dftest/array.txt");
        DataFile instance = new DataFile(F,"Matchar");
        boolean expResult = false;
        boolean result = instance.isfileKamus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of isfileMatChar method, of class DataFile.
     */
    @Test
    public void testIsfileMatChar() {
        System.out.println("isfileMatChar");
        File F = new File("test/dftest/array.txt");
        DataFile instance = new DataFile(F,"Matchar");
        boolean expResult = true;
        boolean result = instance.isfileMatChar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsfileMatChar2() {
        System.out.println("isfileMatChar");
        File F = new File("test/dftest/Dictionary.txt");
        DataFile instance = new DataFile(F,"Kamus");
        boolean expResult = false;
        boolean result = instance.isfileMatChar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
