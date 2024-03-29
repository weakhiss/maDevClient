/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Dec 18, 2011, 2:55:30 PM
 */
package com.weakhiss.aplikasiabsensi.ui.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kojek
 */

public class MainFrame extends javax.swing.JFrame {
    
    private static MainFrame instance;
    
    @Autowired private LoginDialog loginDialog;

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();         
        instance = this;
    }

    public static MainFrame getInstance() {
        return instance;
    }

    public static void setInstance(MainFrame instance) {
        MainFrame.instance = instance;
    }
    
    public void showMain(){
        instance.setExtendedState(JFrame.MAXIMIZED_BOTH);
        instance.setVisible(true);
        instance.loginProcess();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        destktopPanex = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        pengaturanMenuBar = new javax.swing.JMenu();
        registrasiMenuBar = new javax.swing.JMenu();
        alokasiMenuBar = new javax.swing.JMenu();
        laporanMenuBar = new javax.swing.JMenu();
        aksesPemakaiMenuBar = new javax.swing.JMenu();

        jDesktopPane1.setName("jDesktopPane1"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("mainFrame"); // NOI18N

        destktopPanex.setName("destktopPanex"); // NOI18N

        menuBar.setName("menuBar"); // NOI18N

        pengaturanMenuBar.setText("Pengaturan");
        pengaturanMenuBar.setName("pengaturanMenuBar"); // NOI18N
        menuBar.add(pengaturanMenuBar);

        registrasiMenuBar.setText("Registrasi");
        registrasiMenuBar.setName("registrasiMenuBar"); // NOI18N
        registrasiMenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrasiMenuBarMouseClicked(evt);
            }
        });
        menuBar.add(registrasiMenuBar);

        alokasiMenuBar.setText("Alokasi");
        alokasiMenuBar.setName("alokasiMenuBar"); // NOI18N
        menuBar.add(alokasiMenuBar);

        laporanMenuBar.setText("Laporan");
        laporanMenuBar.setName("laporanMenuBar"); // NOI18N
        menuBar.add(laporanMenuBar);

        aksesPemakaiMenuBar.setText("Akses Pemakai");
        aksesPemakaiMenuBar.setName("aksesPemakaiMenuBar"); // NOI18N
        menuBar.add(aksesPemakaiMenuBar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(destktopPanex, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(destktopPanex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrasiMenuBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrasiMenuBarMouseClicked
        JOptionPane.showMessageDialog(MainFrame.getInstance(), "Registrasi is still on progress!");
    }//GEN-LAST:event_registrasiMenuBarMouseClicked

    public void loginProcess(){
        loginDialog.setLocationRelativeTo(null);        
        loginDialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        loginDialog.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {  
                
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aksesPemakaiMenuBar;
    private javax.swing.JMenu alokasiMenuBar;
    private javax.swing.JDesktopPane destktopPanex;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu laporanMenuBar;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu pengaturanMenuBar;
    private javax.swing.JMenu registrasiMenuBar;
    // End of variables declaration//GEN-END:variables
}
