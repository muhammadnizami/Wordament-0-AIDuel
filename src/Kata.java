/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * Kata dan nilainya
 */
public class Kata implements Comparable<Kata>{
    private String k;
    private int score;
    
    
    
    /**ctor
     * 
     */
    public Kata(){
        k = "";
        calculateScore();
    }
    /**ctor
     * membentuk kata
     * @param _k string kata
     */
    public Kata(String _k){
        k = _k;
        calculateScore();
        
    }
    /**cctor
     * 
     * @param K 
     */
    public Kata(Kata K){
        k = K.k;
        score = K.score;
    }
    
    /**setter
     * 
     * @param s string pengganti
     */
    public void setK(String s){
        k = s;
        calculateScore();
    }
    /**getter
     * 
     * @return string kata tersebut
     */
    public String getK(){
        return k; /*belum diimplementasi*/
    }
    
    /**getter
     * 
     * @return skor kata sesuai spek perhitungan skor
     */
    public int getScore(){
        return score; /* belum diimplementasi*/
    }
    
    /**menghitung skor
     * dipanggil saat konstruksi maupun mengganti k
     */
    private void calculateScore(){
        int sum = 0;
        for (int i=0;i<k.length();i++){
            sum+=nilaiHuruf.get(k.charAt(i));
        }
        score = sum * k.length() +( k.length()>=10?100:0);
    }
    
    private static final Map <Character, Integer> nilaiHuruf = new HashMap<>();
    static{
        nilaiHuruf.put('E', 1);
        nilaiHuruf.put('A', 2);
        nilaiHuruf.put('I', 2);
        nilaiHuruf.put('N', 2);
        nilaiHuruf.put('O', 2);
        nilaiHuruf.put('R', 2);
        nilaiHuruf.put('S', 2);
        nilaiHuruf.put('T', 2);
        nilaiHuruf.put('C', 3);
        nilaiHuruf.put('D', 3);
        nilaiHuruf.put('L', 3);
        nilaiHuruf.put('G', 4);
        nilaiHuruf.put('H', 4);
        nilaiHuruf.put('M', 4);
        nilaiHuruf.put('P', 4);
        nilaiHuruf.put('U', 4);
        nilaiHuruf.put('B', 5);
        nilaiHuruf.put('F', 5);
        nilaiHuruf.put('Y', 5);
        nilaiHuruf.put('K', 6);
        nilaiHuruf.put('V', 6);
        nilaiHuruf.put('W', 6);
        nilaiHuruf.put('Z', 8);
        nilaiHuruf.put('X', 9);
        nilaiHuruf.put('J', 10);
        nilaiHuruf.put('Q', 10);
    }
    
    /**
     * Implementasi Comparable
     * Lihat referensi Comparable
     * Membandingkan dua kata berdasarkan score terlebih dahulu
     * bila sama, membandingkan dua kata berdasarkan string k
     */
    @Override
    public int compareTo(Kata o){
        Integer lhs = score;
        Integer rhs = o.score;
        if (!Objects.equals(lhs, rhs))
            return lhs.compareTo(rhs);
        else
            return k.compareTo(o.k);
    }
    
}
