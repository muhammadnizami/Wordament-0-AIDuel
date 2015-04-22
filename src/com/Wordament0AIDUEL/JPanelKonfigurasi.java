package com.Wordament0AIDUEL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.Wordament0AIDUEL.AIPlayer;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.ListModel;
import javax.swing.SwingWorker;
/**
 *
 * @author nim_13512501
 */
public class JPanelKonfigurasi extends javax.swing.JPanel {

    /**
     * Creates new form JPanelPemilihanLawanAI
     */
    public JPanelKonfigurasi() {
        initComponents();
    }
    
    private void updateAIList(){
        List<Class<?>> classes;
        classes = ClassFinder.find("com.Wordament0AIDUEL");
        List<Class<?>> AIPlayerClasses = new ArrayList<>();
        for (Class<?> c: classes){
            if (AIPlayer.class.isAssignableFrom(c))
                if (!c.isInterface())
                    AIPlayerClasses.add(c);
        }
        DefaultListModel listModel = (DefaultListModel) jList1.getModel();
        listModel.clear();
        for (Class<?> c: AIPlayerClasses){
            listModel.addElement(c.getName());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jList1.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Lawan AI:");

        jButton1.setLabel("Update");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabel2.setText("board:");

        jButton3.setText("Saatnya Duel!");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
    }//GEN-LAST:event_formComponentShown

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        updateAIList();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try {
            mulaiBermain();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JPanelKonfigurasi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JPanelKonfigurasi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JPanelKonfigurasi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JPanelKonfigurasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void mulaiBermain() throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        File F = new File("GameData/Dictionary.txt");
        DataFile fdict = new DataFile(F,"Kamus");
        File F2 = new File("GameData/boardFiles/"+ jComboBox1.getSelectedItem()+".txt");
        DataFile fmatchar = new DataFile(F2,"Matchar");
        
        String selectedAI = (String)jList1.getSelectedValue();
        if (selectedAI==null) jLabel1.setText("Lawan AI: (pilih salah satu)");
        Class aipClass = Class.forName(selectedAI);
        AIPlayer aip = (AIPlayer) aipClass.newInstance();
        
        JFrame mainWindow = new JFrame("Wordament-0-AIDuel");
        
        final JPanelMedanDuel jpmd = new JPanelMedanDuel(aip,fmatchar.getMatChar4x4(),fdict.getKamus());
        mainWindow.add(jpmd);
        mainWindow.setSize(500, 800);

        mainWindow.setLocationRelativeTo(null);

        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainWindow.setVisible(true);
        
        Thread tBermain = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    jpmd.bermain(); //To change body of generated methods, choose Tools | Templates.
                } catch (InterruptedException ex) {
                    Logger.getLogger(JPanelKonfigurasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        tBermain.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
