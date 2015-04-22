package com.Wordament0AIDUEL;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class DataFile {
    private File F;
    private boolean isMatChar;
    private boolean isKamus;
    
    public static final String FILETYPE_MATCHAR = "Matchar";
    public static final String FILETYPE_KAMUS = "Kamus";
    public DataFile(File F,String Type){
          this.F = new File(F.getAbsolutePath());
          if (Type.equals(FILETYPE_MATCHAR)){
              isMatChar = true;
              isKamus = false;
          }else if (Type.equals(FILETYPE_KAMUS)){
              isMatChar = false;
              isKamus = true;
          }else{}
              
    }
    
    public Set<String> getKamus() throws FileNotFoundException{
        Set temp = new HashSet<>();
        Scanner input = new Scanner(F);
        while (input.hasNext()){
            temp.add(input.next());
        }
        return temp;
    }

    public char[][] getMatChar4x4() throws FileNotFoundException{
        char[][] temp  = new char[4][4];
        Scanner input = new Scanner(F);
        for(int i = 0; i < 4; ++i)
        {
            for(int j = 0; j < 4; ++j)
            {
                if(input.hasNext())
                {
                    temp[i][j] = input.next().charAt(0);
                }
            }
        }
        return temp;
    }
    public boolean isfileKamus(){
        return isKamus;
    }
    
    public boolean isfileMatChar(){
        return isMatChar;
    }
}
