/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorDeLlistats;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Aleix i Jordi
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private Controlador controlador;

    /**
     * FrmPrincipal new form GUI
     */
    public FrmPrincipal() {
        initComponents();
        // Centrem el JFrame al mig de la pantalla
        setLocationRelativeTo(null);
        // Definim l'icona
        setIconImage(new ImageIcon(getClass().getResource("/img/icona.png")).getImage());
    }

    /**
     * This method is cmateriesSeleccionadeslled from within the constructor to
     * initimateriesSeleccionadeslize the form. WARNING: Do NOT modify this
     * code. The content of this method is
     * materiesSeleccionadeslwmateriesSeleccionadesys
     * regenermateriesSeleccionadested by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFC_buscadorFitxer = new javax.swing.JFileChooser();
        jFC_guardarFitxer = new javax.swing.JFileChooser();
        jB_examinar = new javax.swing.JButton();
        jTF_fitxer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jL_materies = new javax.swing.JList();
        jB_GenerarLlistes = new javax.swing.JButton();
        jB_Seleccionar = new javax.swing.JButton();
        jB_Desseleccionar = new javax.swing.JButton();

        jFC_buscadorFitxer.setDialogTitle("Buscador de fitxers CSV");

        jFC_guardarFitxer.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de llistats");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setIconImages(null);

        jB_examinar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB_examinar.setText("Examinar....");
        jB_examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_examinarActionPerformed(evt);
            }
        });

        jTF_fitxer.setEditable(false);
        jTF_fitxer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTF_fitxer.setToolTipText("");
        jTF_fitxer.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Indica el fitxer que conté les dades:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sel·lecciona les matèries de les quals vols generar llistes:");

        jScrollPane2.setViewportView(jL_materies);

        jB_GenerarLlistes.setText("Generar llistes");
        jB_GenerarLlistes.setEnabled(false);
        jB_GenerarLlistes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GenerarLlistesActionPerformed(evt);
            }
        });

        jB_Seleccionar.setText("Seleccionar tot");
        jB_Seleccionar.setEnabled(false);
        jB_Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SeleccionarActionPerformed(evt);
            }
        });

        jB_Desseleccionar.setText("Deselecciona tot");
        jB_Desseleccionar.setEnabled(false);
        jB_Desseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DesseleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_Seleccionar)
                        .addGap(44, 44, 44)
                        .addComponent(jB_Desseleccionar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTF_fitxer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jB_examinar)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_GenerarLlistes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_fitxer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Seleccionar)
                    .addComponent(jB_Desseleccionar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jB_GenerarLlistes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_examinarActionPerformed
        jFC_buscadorFitxer.setFileFilter(new FileNameExtensionFilter("CSV Files", "csv"));
        jFC_buscadorFitxer.setAcceptAllFileFilterUsed(false);
        jFC_buscadorFitxer.setCurrentDirectory(new File("."));
        jFC_buscadorFitxer.setPreferredSize(new Dimension(600, 450));

        if (jFC_buscadorFitxer.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jFC_buscadorFitxer.getSelectedFile();
            if (file.getName().endsWith(".csv")) {
                controlador = new Controlador(file, jL_materies);
                jTF_fitxer.setText(file.getName());
                controlador.llegirCSV();

                DefaultListModel llistaMateries = new DefaultListModel();
                for (String materia : controlador.obtenirMateries()) {
                    llistaMateries.addElement(materia);
                }
                jB_Seleccionar.setEnabled(true);
                jB_Desseleccionar.setEnabled(true);
                jL_materies.setModel(llistaMateries);

                jL_materies.setSelectionModel(new DefaultListSelectionModel() {
                    @Override
                    public void setSelectionInterval(int index0, int index1) {
                        if (super.isSelectedIndex(index0)) {
                            super.removeSelectionInterval(index0, index1);
                        } else {
                            super.addSelectionInterval(index0, index1);
                        }
                        if (jL_materies.getSelectedValue() != null) {
                            jB_GenerarLlistes.setEnabled(true);
                        } else {
                            jB_GenerarLlistes.setEnabled(false);
                        }
                    }
                });
            } else {
                JOptionPane.showMessageDialog(new JDialog(), "Has escollit un fitxer que no és *.csv", "Fitxer erroni", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jB_examinarActionPerformed

    private void jB_GenerarLlistesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GenerarLlistesActionPerformed
        File fitxer = new File("llista_alumnes.xml");
        int saveJOPane = JOptionPane.showConfirmDialog(null, "Vols guardar-lo manualment?", "Guardar Arxiu", JOptionPane.YES_NO_OPTION);
        if (saveJOPane == JOptionPane.YES_OPTION) {
            jFC_guardarFitxer.setFileFilter(new FileNameExtensionFilter("XML Files", "xml"));
            jFC_guardarFitxer.setAcceptAllFileFilterUsed(false);
            jFC_guardarFitxer.setCurrentDirectory(new File("."));
            jFC_guardarFitxer.setPreferredSize(new Dimension(600, 450));
            if (jFC_guardarFitxer.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = jFC_guardarFitxer.getSelectedFile();

                if (file.getName().endsWith(".xml")) {
                    fitxer = file;
                } else {
                    fitxer = new File(file.getName() + ".xml");
                }
            }
        }

        if (controlador.crearXML(jL_materies.getSelectedValuesList(), fitxer.getName())) {
            saveJOPane = JOptionPane.showConfirmDialog(null, "El vols mostrar?", "Mostrar fitxer", JOptionPane.YES_NO_OPTION);
            if (saveJOPane == JOptionPane.YES_OPTION) {
                try {
                    if (!System.getProperty("os.name").contains("Windows")) {
                        Desktop.getDesktop().open(fitxer);
                    } else if(comprovarExcelExistent()){
                       Runtime.getRuntime().exec("cmd /c start excel \"\" " + fitxer + "");
                    }else{
                        Desktop.getDesktop().open(fitxer);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {

            }
        } else {
            JOptionPane.showMessageDialog(new JDialog(), "No s'ha pogut crear el fitxer", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jB_GenerarLlistesActionPerformed

    private boolean comprovarExcelExistent() {
        try {
            Process p = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "assoc", ".xls"});
            BufferedReader input
                    = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String extensionType = input.readLine();
            input.close();
            if (extensionType == null) {
                return false;
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
        return true;
    }
    private void jB_SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SeleccionarActionPerformed
        jL_materies.setSelectionInterval(0, jL_materies.getModel().getSize() - 1);
    }//GEN-LAST:event_jB_SeleccionarActionPerformed

    private void jB_DesseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DesseleccionarActionPerformed
        jL_materies.clearSelection();
        jB_GenerarLlistes.setEnabled(false);
    }//GEN-LAST:event_jB_DesseleccionarActionPerformed

    /**
     * @param args the commmateriesSeleccionadesnd line
     * materiesSeleccionadesrguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Desseleccionar;
    private javax.swing.JButton jB_GenerarLlistes;
    private javax.swing.JButton jB_Seleccionar;
    private javax.swing.JButton jB_examinar;
    private javax.swing.JFileChooser jFC_buscadorFitxer;
    private javax.swing.JFileChooser jFC_guardarFitxer;
    private javax.swing.JList jL_materies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTF_fitxer;
    // End of variables declaration//GEN-END:variables
}
