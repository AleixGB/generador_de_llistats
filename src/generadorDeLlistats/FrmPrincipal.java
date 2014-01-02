/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorDeLlistats;

import java.awt.Dimension;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
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
     * CremateriesSeleccionadestes new form GUI
     */
    public FrmPrincipal() {
        initComponents();
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
        jPB_Carregar = new javax.swing.JProgressBar();
        jB_examinar = new javax.swing.JButton();
        jTF_fitxer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jL_materies = new javax.swing.JList();
        jB_GenerarLlistes = new javax.swing.JButton();

        jFC_buscadorFitxer.setDialogTitle("Buscador de fitxers CSV");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de llistats");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(jB_examinar)
                    .addComponent(jTF_fitxer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jB_GenerarLlistes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_examinarActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
        jFC_buscadorFitxer.setFileFilter(filter);
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
                        }else{
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
        if (controlador.crearXML(jL_materies.getSelectedValuesList())) {
            JOptionPane.showMessageDialog(new JDialog(), "S'ha creat el fitxer xml correctament");
        } else {
            JOptionPane.showMessageDialog(new JDialog(), "No s'ha pogut crear el fitxer", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jB_GenerarLlistesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton jB_GenerarLlistes;
    private javax.swing.JButton jB_examinar;
    private javax.swing.JFileChooser jFC_buscadorFitxer;
    private javax.swing.JList jL_materies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jPB_Carregar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTF_fitxer;
    // End of variables declaration//GEN-END:variables
}
