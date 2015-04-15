
import java.io.File;
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
    public DataFile(File F, String Type){
        
    }
    
    public Set<String> getKamus(){
        return null;
    }
    public char[][] getMatChar(){
        return null;
    }
}
